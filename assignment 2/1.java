import java.util.*;

class IncreaseScoreByFive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input score:");
        double score = sc.nextDouble();

        // Checking if score is between 80 and 90
        if (score > 80 && score < 90) {
            score = score + 5;
        }
        
        System.out.println("Updated Score: " + score);

        sc.close();
    }
}
