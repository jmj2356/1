import java.util. Scanner;
import java.util. Random;

public class Main {
	static void Term2(int[] n, int N, int K) {
			Random rand = new Random(100);
		
			for(int i=0; i<N; i++) {
				n[i] = rand.nextInt(1000000);
			}
			
			for(int i=0; i<K; i++) {
				int a = rand.nextInt(N);
				int b = rand.nextInt(N);
				int min;
				int max;
				int sum;
		
				if(a<b) {
					min = n[a];
					max = n[a];
					sum= n[a];
					for(int j=a+1; j<=b; j++) {
						if(min > n[j]) min = n[j];
						if(max < n[j]) max = n[j];
						sum = sum +n[j];
				}
				System.out.println(i+1+"��° ������ �ּҰ� : "+min);
				System.out.println(i+1+"��° ������ �ִ밪 : "+max);
				System.out.println(i+1+"��° ������ �հ� : "+sum);
				

				}
				else if(a==b) {					
					min = n[a];
					max = n[a];
					sum = n[a];
					System.out.println(i+1+"��° ������ �ּҰ� : "+min);
					System.out.println(i+1+"��° ������ �ִ밪 : "+max);
					System.out.println(i+1+"��° ������ �հ� : "+sum);
					

				}
				else if(a>b) {
					min = n[b];
					max = n[b];
					sum= n[b];
					for(int j=b+1; j<=a; j++) {   
						if(min > n[j]) min = n[j];
						if(max < n[j]) max = n[j];
						sum = sum +n[j];
					
				}
				System.out.println(i+1+"��° ������ �ּҰ� : "+min);
				System.out.println(i+1+"��° ������ �ִ밪 : "+max);
				System.out.println(i+1+"��° ������ �հ� : "+sum);
				
				}
			}
		}
			
	
			
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("N�� ���� �Է��ϼ��� : ");
		int N = scan.nextInt();
		System.out.println("K�� ���� �Է��ϼ��� : ");
		int K = scan.nextInt();
		int[] v = new int[N];
		long t = System.currentTimeMillis();
		Term2(v,N,K);
		long elapsed = System.currentTimeMillis()-t;
		System.out.println("Elapsed : " + elapsed + "ms");
	}

}
