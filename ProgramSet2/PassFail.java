package ProgramSet2;
import java.util.*;
public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks To Check Pass Or Fail :  ");
        int marks = sc.nextInt();
        PassFail ch = new PassFail(); // Create Object
        ch.Check(marks);

        sc.close();
    }   
    public void Check(int marks){
        if(marks>=40){
            System.out.println("\n You have passed !");
        }
        else{
            System.out.println("\n You Failed ! Please Do better again !");
        }
    } 
}

