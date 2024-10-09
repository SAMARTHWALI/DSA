import java.util.Scanner;

public class Numc{
    public static void main(String[] args) {
        int n = 55596;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n = n / 10;  // Divide by 10 to move to the next digit
        }
        System.out.println(count);
    }
}