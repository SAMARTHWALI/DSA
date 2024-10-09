/*reverse the given number*/
import java.util.Scanner;

public class Num1{
    public static void main(String[] args) {
        int n = 55596;
        int ans = 0;
		int count=0;
        while (n > 0) {
            int rem = n % 10;
            ans = ans*10+rem;
             count++;
			 n=n/10;
        }
		
        System.out.println(ans);
    }
}
