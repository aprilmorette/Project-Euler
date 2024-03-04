import java.math.BigInteger;

public class Euler_16_Duff {
    public static void main(String[] args) {
        BigInteger num = BigInteger.valueOf(2).pow(1000);   // 2^1000
        int sum = 0;
        String digits = num.toString();
        for (int i = 0; i < digits.length(); i++) {
            sum += Integer.parseInt(String.valueOf(digits.charAt(i)));
        }
        System.out.println(sum);
    }
}
