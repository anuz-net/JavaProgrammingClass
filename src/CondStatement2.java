import java.util.*;
public class CondStatement2 {
    public static void main(String[] args) {
        System.out.println("Enter a Number 0, 1, 2");
        Scanner sc= new Scanner(System.in);
        int button=sc.nextInt();
        if(button==0){
            System.out.println("Namaste");
        } else if (button==1) {
            System.out.println("Hello");
        } else if (button==2) {
            System.out.println("Bonjur");

        }
        else {
            System.out.println("Invalid Command");
        }

    }
}
