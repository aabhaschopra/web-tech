import java.util.Scanner;

class ConsoleProgram {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = s.nextInt();

        System.out.print("Hailstone Sequence for " + n + " is: ");

        // While n is not equal to 1 check if n is even, if yes then reduce it by half otherwise increment by multiplying it by three and adding one
        // At each iteration print n 
        while(n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            }

            else {
                n = (3 * n) + 1;
            }

            System.out.print(n + " ");
        }

        s.close();
    }
}