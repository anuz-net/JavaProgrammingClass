import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        armstrong(num);
    }
    public static void armstrong(int num) {
        int rem, sum = 0;
        int temp=num;
        while (num != 0) {
            rem = num % 10;
            sum += rem * rem*rem;
            num = num / 10;

        }
        if (sum==temp){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an Armstrong number");
        }
    }
}
