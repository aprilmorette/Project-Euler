public class Euler_10_Duff {
    public static void main(String[] args) {
        long sum = 2;
        for (long i = 3; i < 2000000; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
    static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
