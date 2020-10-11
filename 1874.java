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
        char ch[] = new char[1000001];					
        for(int i=0; i<num; i++){				
            int v = scan.nextInt();					
            arr[i]=v;								   
            
        }
        int j=1;
        int k=0;
        for(int i=0; i<num; i++) {
        	if(!stack.isEmpty() && stack.peek()>arr[i]) { 	
        		System.out.println("NO");
        		return;
        	}
        	for( ; j<=arr[i]; j++) {	
        		if(check[j]==true) {
        			stack.push(j);
            		ch[k++]='+';
        		}
        	}
        	j--;							
        	stack.pop();			
        	check[j]=false;			
        	ch[k++]='-';
        }
        for(int i=0; i<k; i++)
        	System.out.println(ch[i]);
    }
}
