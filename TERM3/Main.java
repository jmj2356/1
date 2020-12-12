import java.util. Scanner;
import java.util. Random;

public class Main {
	static void Term2(int[] n, int N, int K) {
			Random rand = new Random(100);
			for(int i=0; i<N; i++) {
				n[i] = rand.nextInt(1000000);
			}
			int amax=n[0];
			int amin=n[0];
			int m1 = 0;
			int m2 = 0;
			
			for(int i=0; i<N; i++) {
				if(amax<n[i]) {
					amax =n[i];
					m1=i;
				}
				if(amin>n[i]) {
					amin =n[i];
					m2=i;
				}
			}
			
			
			for(int i=0; i<K; i++) {
				int a = rand.nextInt(N);
				int b = rand.nextInt(N);
				int min=1000000;
				int max=0;
				long sum=0;
		
				if(b<a) {
					int t =a;
					a=b;
					b=t;
				}
				
				if(a<=m1&& b>=m1) max = n[m1];
				else {
					for(int j=a; j<=b; j++) { 
						if(max<n[j]) max =n[j];
					}
				}
				if(a<=m2&& b>=m2) min =n[m2];
				else {
					for(int j=a; j<=b; j++) {
						if(min > n[j]) min =n[j];
					}
				}
				for(int j=a; j<=b; j++) {   
					sum = sum +n[j];
				}
				System.out.println(i+1+"번째 구간의 최소값 : "+min);
				System.out.println(i+1+"번째 구간의 최대값 : "+max);
				System.out.println(i+1+"번째 구간의 합계 : "+sum);

			}
		}
			
	
			
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("N의 값을 입력하세요 : ");
		int N = scan.nextInt();
		System.out.println("K의 값을 입력하세요 : ");
		int K = scan.nextInt();
		int[] v = new int[N];
		long t = System.currentTimeMillis();
		Term2(v,N,K);
		long elapsed = System.currentTimeMillis()-t;
		System.out.println("Elapsed : " + elapsed + "ms");
	}

}
