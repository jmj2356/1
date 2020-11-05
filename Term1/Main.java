import java.util.Random;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		System.out.println("N을 입력하세요: ");
		int N = scan.nextInt();
		System.out.println("a를 입력하세요: ");
		int a = scan.nextInt();
		System.out.println("b를 입력하세요: ");
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
		System.out.println("최대값과 최소값의 합은 "+(max+min)+"입니다.");
}
}