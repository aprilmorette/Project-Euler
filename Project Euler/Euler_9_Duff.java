/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2. There exists exactly one Pythagorean triplet for which 
 * a + b + c = 1000.
 * 
 * Find the product abc.
 */

public class Euler_9_Duff {
    public static void main(String[] args) {
        int sum = 1000; int c;
        outerloop:
        for (int a = 1; a < sum / 3; a++) {
            for (int b = a + 1; b < sum / 2; b++) {
                c = sum - a - b;
                if (isTriplet(a, b, c)) {
                    System.out.println(a * b * c);
                    break outerloop;
                }
            }
        }
    }
    public static boolean isTriplet(int a, int b, int c) {
        boolean test = false;
        if (a < b && b < c) {
            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                test = true;
            } else {
                test = false;
            }
        }
        return test;
    }
}