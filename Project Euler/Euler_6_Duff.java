/**
 * The sum of the squares of the first ten natural numbers is 385.
 * The square of the sum of the first ten natural numbers is 3025.
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one 
 * hundred natural numbers and the square of the sum.
 */

public class Euler_6_Duff {
    public static void main(String[] args) {
        double sum = 0; double sumOfSquares = 0;
        double output;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            sumOfSquares += Math.pow(i, 2);
        }
        output = Math.pow(sum, 2) - sumOfSquares;
        System.out.println(output);
    }
}
