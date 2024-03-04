public class Euler_2_Duff {
    public static void main(String[] args) {
		int sum = 0;
		int numOne = 1;
		int numTwo = 1;
		int temp;
		do {
            if (numTwo % 2 == 0) {
                sum += numTwo;
            }

			temp = numOne + numTwo;
			numOne = numTwo;
			numTwo = temp;
		} while (numTwo < 4000000);
		System.out.println(sum);
	}
}
