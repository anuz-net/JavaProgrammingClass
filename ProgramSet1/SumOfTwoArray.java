// Sum of Array nikalnee edi ..
import java.util.Scanner;
public class SumOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1 = 0;
        int sum2 = 0;
        int a[][] = new int[3][3]; 
        int b[][] = new int[3][3]; 

        System.out.println("Enter the first array : ");	
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++ ){
                sum1=sum1+a[i][j];
            }
        }
        System.out.println("Enter the second array : ");	
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++ ){
                sum2=sum2+b[i][j];
            }
        }
        if(sum1==sum2)
            System.out.println("Both the arrays are equal");
        else
            System.out.println("Both the arrays are not equal");
            
        
        }
}