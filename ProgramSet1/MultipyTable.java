import java.util.*;
public class MultipyTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a number To Print the Table of :");
        int n = sc.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(n + " X " + i + " = " + n*i + "\n");
        }
    }
}
