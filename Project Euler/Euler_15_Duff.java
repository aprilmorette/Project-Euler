/*
 * Starting in the top left corner of a 2x2 grid, and only being able to move 
 * to the right and down, there are exactly 6 routes to the bottom right corner.
 * 
 * How many such routes are there through a 20x20 grid?
 */

import java.math.BigInteger;

public class Euler_15_Duff {
    public static void main(String[] args) {
        // for an n*n grid: (2n)! / (n! * n!)
        System.out.println(factorial(40).divide((factorial(20).multiply(factorial(20)))));
    }
    public static BigInteger factorial(int n) {
        BigInteger num = BigInteger.ONE;
        BigInteger one = BigInteger.valueOf(n);
        if (n == 0) {
            return num;
        } else {
            return one.multiply(factorial(n - 1));
        }
    }
}
