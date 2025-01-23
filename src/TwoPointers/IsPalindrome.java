package TwoPointers;

import java.util.Stack;

public class IsPalindrome {

    public static void main(String[] args) {

        String s = "0P";


        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        char[] tab = s.toCharArray();
        int j = s.length() -1;

        for (int i = 0; i < j; i++) {
            if(tab[i] != tab[j]) return false;
            j--;
        }

        return true;
    }

}
