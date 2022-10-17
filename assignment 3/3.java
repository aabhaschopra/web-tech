import java.util.Scanner;
import java.util.Arrays;

class SortString {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Input string: ");
        String str= s.nextLine();

        char[] array = str.toCharArray();
        Arrays.sort(array);
        str = new String(array);

        System.out.println("Sorted string is: " + str);
        s.close();
    }
}