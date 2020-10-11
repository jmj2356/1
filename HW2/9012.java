import java.util.Scanner;
import java.util.Stack;

public class Main{
    
    public static void main(String []args){
        Stack<Integer> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int arr[] = new int[num];					
        boolean check[] = new boolean[num+1]; 		
        for(int i=1; i<num+1; i++) {
        	check[i]=true;						
        }
        char ch[] = new char[1024];					
        for(int i=0; i<num; i++){				
            int v = scan.nextInt();					
            arr[i]=v;								   
            
        }
        int j=1;
        int k=0;
        for(int i=0; i<num; i++) {
        	if(!stack.isEmpty() && stack.peek()>arr[i]) { //	stack 값이 비어있지않고 stack의 top값이 arr[i]보다 크면	
        		System.out.println("NO");
        		return;
        	}
        	for( ; j<=arr[i]; j++) {	//	위에서 j를 1부터 한 이유는 j의 값이 top에 대응하게 하기 위해서
        		if(check[j]==true) {
        			stack.push(j);
            		ch[k++]='+';
        		}
        	}
        	j--;					//	여기에서 수많큼 push후 j를 빼면 j의 값은 제거한 위치 값이 되고		
        	stack.pop();			//	해당 top을 제거하고
        	check[j]=false;			//	제거한 top이 false가 되게 하여 해당 위치에서 +가 생성되지 않도록 한다.
        	ch[k++]='-';
        }
        for(int i=0; i<k; i++)
        	System.out.println(ch[i]);
    }
}