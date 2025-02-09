import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        palindrome(num);
    }

    public static void palindrome(int num) {
        int rem, rev = 0;
        int temp = num;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a Palindrome number!");
        }
    }   
}
