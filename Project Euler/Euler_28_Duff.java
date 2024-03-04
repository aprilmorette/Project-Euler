public class Euler_28_Duff {
    public static void main(String[] args) {
        long count = 1;
        int i = 1;
        for (int j = 2; j < 1001; j += 2) {
            for (int k = 0; k < 4; k++) {
                i += j;
                count += i;
            }
        }
        System.out.println(count);
    }
}
