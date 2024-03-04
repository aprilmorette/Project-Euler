public class Euler_7_Duff {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while (true) {
            if (isPrime(num)) {
                count++;
            }
            if (count == 10001) {
                break;
            }
            num++;
        }
        System.out.println(num);
    }
    static boolean isPrime(int n) {
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
