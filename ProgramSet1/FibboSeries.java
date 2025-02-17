// to find the fibonacci series using recursion
import java.util.Scanner;
public class FibboSeries {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int i;
        if(num<0)
        {
            System.out.println("Please enter the positive number");
            return;
        }
        for(i=0;i<num;i++)
        {
            System.out.println(fibonacci(i));
        }
        sc.close();
    }
    public static int fibonacci(int num)
    {
        if(num==0)
        {
            return 0;
        } else if (num==1) {
            return 1;
        }
        else {
            return fibonacci(num-1)+fibonacci(num-2);
        }
    }
}