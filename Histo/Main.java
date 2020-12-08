import java.util.Scanner;
public class Main {
	// 분할정복을 위한 histo 함수
	static int histo(int[] v, int a, int b) {
		int c= (a+b)/2;
		if((a+b)%2!=0) c = c-1/2;
		int max =0;
		int max1=0;
		int max2 =0;
		int max3= 0;
		int x = 0;
		int[] x1 = new int[b];
		int[] x2 = new int[b];
		int[] x3 = new int[b];
		int y = 0;
		for(int i=a; i<=c; i++) {
			y =v[i];
			for(int j =i; j<=c; j++) {
				if(y<=v[j]) x++;
				else break; 
			}
			for(int k=1; k<=c; k++) {
				
				break;
			}
			x1[i] = x*y;
			}
		for(int i=a; i<=c; i++) {
			if(max1<=x1[i]) max1 = x1[i];
		}
		
		x= 0;
		for(int i=c+1; i<=b; i++) {
			y=v[i];
			for(int j=i; j<b; j++) {
				if(y<=v[j]) x++;
				else break;
			}
			for(int k=1; k<=c; k++) {
				if(y<=v[i-k] && i-k>=c+1) x++;
				else break;
			}
			x2[i] = x*y;
		}
		for(int i=c+1; i<=b; i++) {
			if(max2<=x2[i]) max2 = x2[i];
		}
		
		x=0;
			if(c%2==0) {
				if(v[c]<=v[c+1]) y=v[c];
				else if(v[c]<=v[c-1]) y=v[c+1];
			}
			else y = v[c];
			for(int i=a; i<=b; i++) {
					if(y==v[c]) {
						for(int j=1; j<=c+1; j++) {
							if(c+j<=b && y<=v[c+j]) x++;
							else break;
						}
						for(int j=1; j<=c; j++) {
							if(c-j>=a && y>=v[c-j]) x++;
							else break;
				}
			}
					else if(y==v[c+1]) {
						for(int j=1; j<=c; j++) {
							if(c+1+j<=b && y<=v[c+1+j]) x++;
							else break;
						}
						for(int j=1; j<c+1; j++) {
							if(c+1-j>=a && y>=v[c+1-j]) x++;	
							else break;
				}
			}
				x3[i] = x*y;
			}
			for(int i=a; i<=b; i++) {
				if(max3<=x3[i]) max3 =x3[i];
			}	
		if(max1>=max2&&max1>=max3) max = max1;
		else if(max2>=max1&&max2>=max3) max = max2;
		else if(max3>=max1&&max3>=max2) max = max3;
		return max;
	}
	// 가장 큰 직사각형의 넓이를 반환합니다.
	// n : 샘플의 수
	// v : n개의 샘플들의 도수
	// 반환 : 직사각형의 넓이
	static int histo(int[] v, int n) {
		return histo(v,0,n-1);
		
	}
	public static void main(String[] args) {
		// 스캐너 오브젝트 생성
		Scanner scan = new Scanner(System.in);
		// 샘플의 수 입력
		int n = scan.nextInt();
		// 도수를 저장할 배열 생성
		int[] v = new int[n];
		// n개의 도수를 입력받아 배열 v에 저장
		for(int i =0; i<n; i++) {
			v[i] = scan.nextInt();
		}
		// 가장 큰 직사각형의 넓이 계산
		int r = histo(v, n);
		// 출력
		System.out.println(r);
	}

}
