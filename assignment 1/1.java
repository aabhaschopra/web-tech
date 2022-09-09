import java.util.*;

class AdditionSubtraction {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input first integer number:");
        int number1 = sc.nextInt();

        System.out.println("Input second integer number:");
        int number2 = sc.nextInt();

        int addition = number1 + number2;
        int subtraction = number1 - number2;
        
        System.out.println("\nAddition: " + addition);
        System.out.println("Subtraction: " + subtraction);

        sc.close();
    }
}
