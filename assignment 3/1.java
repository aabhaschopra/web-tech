import java.util.Scanner;

class CompareStrings{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Input first string: ");
        String s1 = s.nextLine();

        System.out.print("Input second string: ");
        String s2 = s.nextLine();

        int compared_value = 0;

        // Start iterating through characters in string s1 and compare characters in s1 at the same position as s2 
        // If unicode value of both the characters is same then continue otherwise make compared_value = (str1[i] - str2[i]) and break
        for (int i = 0; i < s1.length() && i < s2.length(); i++)
        {
            int val1 = s1.charAt(i);
            int val2 = s2.charAt(i);
            
            if (val1 != val2)
            {
                compared_value = val1 - val2;
                break;
            }
        }

        // If s2 is a substring of s1 or s1 is a substring of s2 then take comapred_value = s1.length() - s2.length();
        if (compared_value == 0 && (s1.length() > s2.length() || s2.length() > s1.length())) {
            compared_value = s1.length() - s2.length();
        }

        // Print the compared_value 
        System.out.println("Strings comapared lexicographically return: " + compared_value);

        s.close();
    }
}