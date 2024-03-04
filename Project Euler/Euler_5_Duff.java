/**
 * 2520 is the smallest number that can be divided by each of the 
 * numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by
 * all of the numbers from 1 to 20?
 */

public class Euler_5_Duff {
    public static void main(String[] args) {
        int num = 2520; int count = 0;
        while(count != 10) {
            num += 2520; count = 0;
            for (int i = 11; i <= 20; i++) {
                if (divisible(num, i)) {
                    count++;
                }
            }
        }
        System.out.println(num);
    }
    public static boolean divisible(int x, int y) {
        boolean test = ((x % y == 0) ? true : false);
        return test;
    }
}
