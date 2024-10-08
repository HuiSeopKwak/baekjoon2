package algo.swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Swea2105 {
    static int T, N;
    static int[][] map;
    static int sX, sY;
    static int ans;
    static boolean[][] visited;
    static int[] dx = {1,1,-1,-1};
    static int[] dy = {-1,1,1,-1};
    static HashSet<Integer> desert;

    static void start(int x, int y, int dir){
        for(int d=dir;d<4;d++){
            int nx = x+dx[d];
            int ny = y+dy[d];
            if(!isIn(nx,ny)) continue;
            if(nx==sX&&ny==sY&&desert.size()>=3) {
                ans = Math.max(ans,desert.size());
                return;
            }
            if(!desert.contains(map[nx][ny])&&!visited[nx][ny]){
                desert.add(map[nx][ny]);
                visited[nx][ny]=true;
                start(nx,ny,d);
                visited[nx][ny]=false;
                desert.remove(map[nx][ny]);
            }
        }
    }

    static boolean isIn(int x, int y){
        if(x<0||x>=N||y<0||y>=N) return false;
        return true;
    }

    static void init(){
        desert.clear();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                visited[i][j] = false;
            }
        }
    }

    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        for(int tc=1;tc<=T;tc++){
            N = Integer.parseInt(br.readLine().trim());
            map = new int[N][N];
            visited = new boolean[N][N];
            desert = new HashSet<>();
            ans = -1;

            for(int i=0;i<N;i++){
                st = new StringTokenizer(br.readLine().trim());
                for(int j=0;j<N;j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    sX = i;
                    sY = j;
                    init();
                    desert.add(map[i][j]);
                    visited[i][j]=true;
                    start(i,j,0);
                    desert.remove(map[i][j]);
                    visited[i][j]=false;
                }
            }
            System.out.println("#"+tc+" "+ans);

        }

    }
}