import java.util.Scanner;

public class StackOperation {
    public static final int MAX = 4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stack = new int[MAX];
        int top = -1;
        int choice;
        int n;

        System.out.println("Enter the stack size (less than max value = " + MAX + "): ");
        n = sc.nextInt();

        if (n > MAX) {
            System.out.println("Stack size exceeds maximum limit. Setting it to " + MAX);
            n = MAX;
        }

        while (true) {
            System.out.println("\nPerforming Stack Operations:");
            System.out.println("1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    top = push(stack, top, n, value);
                    break;
                case 2:
                    top = pop(stack, top);
                    break;
                case 3:
                    display(stack, top);
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }

    public static int push(int[] stack, int top, int n, int value) {
        if (top == n - 1) {
            System.out.println("Stack is full!");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack.");
        }
        return top;
    }

    public static int pop(int[] stack, int top) {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Popped element: " + stack[top]);
            top--;
        }
        return top;
    }

    public static void display(int[] stack, int top) {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}