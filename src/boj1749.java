import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*****
 * ���� 11660 ���� �� ���ϱ�

*/
public class boj1749 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int [][] board = new int[n][m];		// �Է� ���� �迭
		int [][] Sboard = new int[n][m];	// ������ �迭
		
		// �迭 �Է� �ޱ��
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				Sboard[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
	}

}
