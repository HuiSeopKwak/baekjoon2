/*****
 * ���� 20438�� �⼮üũ
 * �л� ��ȣ�� 3 ~ n+2 ����

*/
import java.util.Scanner;

public class boj20438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1��°�� �Է�
		int n = sc.nextInt();	// ��ü �л� ��
		int k = sc.nextInt();	// ���� �л� ��
		int q = sc.nextInt();	// �⼮ �ڵ� ���� �л� ��
		int m = sc.nextInt();	// �־��� ������ ��
		
		int[] k_stu = new int[k];	// ���� �л����� ���� ��ȣ �迭
		int[] q_stu = new int[q];	// �⼮ �ڵ� ���� �л����� ���� ��ȣ �迭
		
		// 2��°�� ���� �л� ���� ��ȣ
		for (int i = 0; i < k; i++) {
			k_stu[i] = sc.nextInt();
		}
		// 3��°�� �⼮ �ڵ� ���� �л� ��ȣ
		for (int i = 0; i < q; i++) {
			q_stu[i] = sc.nextInt();
		}
		// 4��°�� ���� ����
		int s = sc.nextInt();
		int e = sc.nextInt();
		
		

	}

}
