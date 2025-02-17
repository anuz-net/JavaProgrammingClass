import java.util.*;
public class Switch {
    public static void main(){
        System.out.println("-------Switch Case--------");
        System.out.println("Enter any Number ( 1, 2 ,3 ) :");
        Scanner sc= new Scanner(System.in);
        int button=sc.nextInt();
        switch(button){
            case 1:
                System.out.println("Namaste");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Command");
        }
    }
}
