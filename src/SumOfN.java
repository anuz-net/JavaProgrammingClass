import java.util.*;
public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter The Number you want to Sum " );
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            sum= sum + i;
        }
        System.out.println(sum);


        

    }
}
