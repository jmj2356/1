import java.util.Random;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		System.out.println("N�� �Է��ϼ���: ");
		int N = scan.nextInt();
		System.out.println("a�� �Է��ϼ���: ");
		int a = scan.nextInt();
		System.out.println("b�� �Է��ϼ���: ");
		int b = scan.nextInt();
		int A[] =new int[N];
		for(int i=0; i<N; i++) {
			A[i] = random.nextInt(10000000);
		}
		int max = 0;
		int min = 100000000;
		for(int k=a; k<=b; k++) {
			if(A[k] > max) 
				max = A[k];
		
			if(A[k] < min) {
				min = A[k];
			}
		}
		System.out.println("�ִ밪�� �ּҰ��� ���� "+(max+min)+"�Դϴ�.");
}
}