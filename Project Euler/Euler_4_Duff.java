/**
 * A palindromic number reads the same both ways. The largest palindrome
 * made from the product of two 2-digit numbers is 9009 = 91 x 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Euler_4_Duff {
    public static void main(String[] args) {
        int product; int output = 0;

        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                product = i*j;
                if (isPalindrome(product) == true) {
                    if (product > output) {
                        output = product;
                    }
                }
            } 
        }
        System.out.println(output);
    }

    public static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        String reverse = "";
        boolean test = false;
        for (int i = num.length() - 1; i >= 0; i--) {
            reverse += num.charAt(i);
        }
        if (num.compareTo(reverse) == 0) {
            test = true;
        }
        return test;
    }
}