import java.util.Scanner;

public class Dev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter first num");
		int a = sc.nextInt();
		System.out.println("enter 2 num");
        int b = sc.nextInt();
		System.out.println("enter 3 num");
        int c = sc.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        
        System.out.println("max number is " + max);
        sc.close(); // Closing the scanner
    }
}