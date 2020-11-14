import java. util.Scanner;

	class Queue<E> {
	int[] queue = new int[10000];
	int front=-1;
	int back=-1;
		
	public void pushX(int X) {
		queue[++back] = X;
	}
	public int empty() {
		if(back==front) return 1;
		else return 0;
	}
	public int pop() {
		if(empty() == 1) return -1;
		int t = queue[front+1];
		queue[front+1] = -1;
		front ++;
		return t;
	}
	public int size() {
		return back-front;
	}
	public int front() {
		if(empty()==1) return -1;
		else return queue[front+1];
		}
	public int back() {
		if(empty() ==1) return -1;
		else return queue[back];
	}
	}
public class Main {
	static Queue q = new Queue();
	public static void main(String[] args) {	
			Scanner scan = new Scanner(System.in);
			int N = scan.nextInt();
			for(int i=0; i<N; i++) {
				String A = scan.next();
				
				if(A.contains("push")) {
					int x= scan.nextInt();
					q.pushX(x);
				}
				else if(A.contains("pop"))
					System.out.println(q.pop());
				else if(A.contains("size"))
					System.out.println(q.size());
				else if(A.contains("empty"))
					System.out.println(q.empty());
				else if(A.contains("front"))
					System.out.println(q.front());
				else if(A.contains("back"))
					System.out.println(q.back());
				
			
			}
			return;
	

	}


}