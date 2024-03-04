public class Euler_20_Duff {
    public static void main(String[] args) {
        long output = factorial(100);
        System.out.println(output);
    }
    public static long factorial(long n) {
		if (n == 0) {
			return 1;
		} else {
			return (n + (factorial(n-1)));
		}
	}
}
