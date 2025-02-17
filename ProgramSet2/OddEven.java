// 8.	Write a Java program to check whether a given number is even or odd using if-else.
package ProgramSet2;
import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        OddEven obj = new OddEven();
        obj.check(num);

        sc.close();
    }
    public void check(int num){
        if(num==0){
            System.out.println("It is Zero");
        }
        else if (num%2==0){
            System.out.println("It is Even Number");
        }
        else{
            System.out.println("It is Odd Number");
        }


    }
}
