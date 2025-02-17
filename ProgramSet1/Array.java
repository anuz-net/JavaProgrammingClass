// Wap to Find the second Largest Element in a Array
import java.util.*;
public class Array {
    public static void main(String[] args) {
        int num, i, frequency=0;
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        i=0;
        while (i < numbers.length) {
            if (numbers[i] == num) {
                frequency++;
            }
            i++;
        }
        System.out.println("Frequency of " + num + " is : " + frequency);
        sc.close();

    }

}