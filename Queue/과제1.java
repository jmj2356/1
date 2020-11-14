
import java.util.Scanner;
import java.util.Random;

public class Main {
	static void Proj(int n) {
		int[] queue = new int[10000];
		int[] stack = new int[10000];
		int head = 0, tail =0;
		int top =-1;
		
		Random rand =new Random();
		
		for(int i=0;i<n;i++) {
			queue[tail] = rand.nextInt(10000);
			tail =(tail+1)%10000;
		}
			while(head !=tail) {
				int v = queue[head];
				head = (head+1)%10000;
				while(top!=-1 && v>stack[top]) {
						int u = stack[top--];
						queue[tail] = u;
						tail= (tail+1)%10000;
				}
				stack[++top] = v;
				}
			
			for(int i=0;i<n;i++) {			
				System.out.println(stack[i]);				
			}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Proj(n);
	}


}