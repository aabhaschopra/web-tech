import java.util.*;

class MultiplyFloat {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input first float number:");
        float number1 = sc.nextFloat();

        System.out.println("Input second float number:");
        float number2 = sc.nextFloat();

        float multiplication = number1 * number2;
        
        System.out.println("\nMultiplication: " + multiplication);

        sc.close();
    }
}
