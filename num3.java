/*sum of all digits of given number*/
import java.util.Scanner;

public class Num3{
    public static void main(String[] args) {
        int n = 22;
		int o;
        int ans = 0;
		int count=0;
        while (n > 0) {
            int rem = n % 10;
            ans = ans+rem;
             count++;
			 n=n/10;
        }
		System.out.println(ans);
		
    }
}
