import java.util.*;
public class SwitchCalculator {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose any number of this options : \n 1. Add \n 2.Subtract \n 3.Multiply \n 4.Divide \n 5. Modulus \n");
        int button = sc.nextInt();
        System.out.println("Enter any two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int mod = a%b;
        
        switch(button){
            case 1:
            System.out.println("Your Answer is :" + add);
            break;

            case 2:
            System.out.println("Your Answer is :" + sub);
            break;

            case 3:
            System.out.println("Your Answer is :" + mul);
            break;

            case 4:
            System.out.println("Your Answer is :" + div);
            break;

            case 5:
            System.out.println("Your Answer is :" + mod);
            break;

        }
    }
}
