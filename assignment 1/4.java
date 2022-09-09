import java.util.*;

class SwapNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Swapping using temporary variable");
        System.out.println("Input First Number:");
        int number1 = sc.nextInt();

        System.out.println("Input Second Number:");
        int number2 = sc.nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("\nAfter swap");
        System.out.println("First Number: " + number1);
        System.out.println("Second Number: " + number2);


        System.out.println("\nSwapping without using temporary variable");
        System.out.println("Input First Number:");
        number1 = sc.nextInt();

        System.out.println("Input Second Number:");
        number2 = sc.nextInt();

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("\nAfter swap");
        System.out.println("First Number: " + number1);
        System.out.println("Second Number: " + number2);

        sc.close();
    }
}
