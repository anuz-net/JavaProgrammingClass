// 9.	Write a Java program to print the day of the week using a switch statement.
package ProgramSet2;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        System.out.println("Printing Days of Week \n Please Choose Number From (1 - 7) !");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1 : 
            System.out.println("Sunday");
            break;
            
            case 2:
            System.out.println("Monday");
            break;

            case 3:
            System.out.println("Tuesday");
            break;

            case 4:
            System.out.println("Wednesday");
            break;

            case 5:
            System.out.println("Thursday");
            break;

            case 6:
            System.out.println("Friday");
            break;

            case 7:
            System.out.println("Saturday");
            break;

            default:
            System.out.println("Invalid Choice");
        }
        sc.close();
    }
}