import java.math.BigInteger;

public class Euler_24_Duff {
    public static void main(String[] args) {
        int length = 0;
        int i = 1;
        while (length != 1000) {
            BigInteger x = fib(i);
            String s = String.valueOf(x);
            length = s.length();
            if (length == 1000) {
                System.out.println(i);
            }
            i++;
        }
    }
    static BigInteger fib(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return b;
    }
}
