package ProgramSet2;
import java.util.*;
public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Third Number : ");
        int num3 = sc.nextInt();
        sc.close();
        Check(num1, num2, num3);
    }
    public static void Check(int num1, int num2, int num3 ){
        if(num1>num2 && num1>num3){
            System.out.println(num1 + " is the greatest");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2 + " is the greatest");

        }
        else{
            System.out.println(num3 + " is the greatest");
        }

    }
}
