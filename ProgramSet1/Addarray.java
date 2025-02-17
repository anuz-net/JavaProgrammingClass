import java.util.Scanner;

public class Addarray {
    public static void main(String[] args) {
        // Add two matrix in java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] firstMatrix = new int[r][c];
        int[][] secondMatrix = new int[r][c];
        System.out.println("Enter the elements of the first matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                firstMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                secondMatrix[i][j] = sc.nextInt();
            }
        }
        int[][] sumMatrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        System.out.println("The sum of the matrices is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
            sc.close();
        }
    }
}
