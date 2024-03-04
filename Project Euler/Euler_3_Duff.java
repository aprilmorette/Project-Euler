import java.util.*;

public class Euler_3_Duff {
    public static void main(String[] args) {
        long prime = 600851475143L;
        int factor = 2;

        while (Math.pow(factor, 2) <= prime) {
            if (prime % factor == 0) {
                prime /= factor;
            } else {
                factor++;
            }
        }
        System.out.println(prime);
    }
}
