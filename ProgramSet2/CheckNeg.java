//6.	Write a Java program to check whether a given number is positive, negative, or zero using if-else.
package ProgramSet2;

import java.util.Scanner;

public class CheckNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num =sc.nextInt();

        sc.close();
        Check(num);

    }
    public static void Check(int num){
        if(num<0){
            System.out.println("It is a Negative Number");
        }
        else if(num>0){
            System.out.println("It is a Positive Number");
        }
        else{
            System.out.println("It is Zero !!!");
        }


    }

}
