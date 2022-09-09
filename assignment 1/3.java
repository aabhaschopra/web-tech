import java.util.*;

class QuotientRemainder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input Dividend:");
        int number1 = sc.nextInt();

        System.out.println("Input Divisor:");
        int number2 = sc.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        System.out.println("\nQuotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        sc.close();
    }
}
