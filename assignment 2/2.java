import java.util.*;

class MinOfThree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Taking Inputs
        System.out.println("Input first number:");
        double number1 = sc.nextDouble();

        System.out.println("Input second number:");
        double number2 = sc.nextDouble();

        System.out.println("Input third number:");
        double number3 = sc.nextDouble();

        double smallestNumber;

        // Comparing and finding smallest number amongst three
        if (number1 < number2 && number1 < number3) {
            smallestNumber = number1;
        }

        else if (number2 < number1 && number2 < number3) {
            smallestNumber = number2;
        }

        else {
            smallestNumber = number3;
        }
        
        System.out.println("Smallest Number: " + smallestNumber);

        sc.close();
    }
}
