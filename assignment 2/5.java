import java.util.*;

class Powers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input number:");
        int n = sc.nextInt();

        // Generating Powers
        System.out.println("n n^2 n^3 n^4");

        for (int i = 1; i <= n; i++) {
            int power = 1;
            for (int j = 1; j <= 4; j++) {
                power = power * i;
                System.out.print(power + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
