/*cprint fibonacci series*/

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
	    
		System.out.println("enter the n value");
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int count=2;
		while(n>=count)
		{
			System.out.println(a);
			int temp=b;
			b=b+a;
			a=temp;
			count++;
			
		}
		
			
		
		
			
    }
}
