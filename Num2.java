/*cheak given number is palindrome*/
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        int n = 56311365;
		int original=n;
        int ans = 0;
		int count=0;
        while (n > 0) {
            int rem = n % 10;
            ans = ans*10+rem;
             count++;
			 n=n/10;
        }
		System.out.println(ans);
		if (original == ans)
		{
			
		System.out.println("palindrome");
		}
		else{
		System.out.println("not palindrome");
		}
    }
}
