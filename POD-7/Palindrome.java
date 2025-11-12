import java.util.*;

public class Palindrome {
    public static boolean CheckPalindrome(String n) {
        // convert to lowercase first
        n = n.toLowerCase();

        // then remove all non-alphanumeric characters
        String word_af = n.replaceAll("[^a-z0-9]", "");

        // reverse the string
        String word_rev = "";
        for (int i = word_af.length() - 1; i >= 0; i--) {
            word_rev += word_af.charAt(i);
        }

        // compare original and reversed
        return word_af.equals(word_rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        System.out.println(CheckPalindrome(word));
    }
}
