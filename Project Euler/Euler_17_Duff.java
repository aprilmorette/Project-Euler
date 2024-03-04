import java.util.ArrayList;

public class Euler_17_Duff {
    public static void main(String[] args) {
        String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] hundreds = {"onehundred", "twohundred", "threehundred", "fourhundred", "fivehundred", "sixhundred", "sevenhundred",
                                "eighthundred", "ninehundred"};
        ArrayList<String> allNums = new ArrayList<String>();
        // adding numbers 1 - 99
        for (int i = 0; i < ones.length; i++) {
            allNums.add(ones[i]);
        }
        for (int i = 0; i < teens.length; i++) {
            allNums.add(teens[i]);
        }
        for (int i = 0; i < tens.length; i++) {
            allNums.add(tens[i]);
            for (int j = 0; j < ones.length; j++) {
                allNums.add(tens[i] + ones[j]);
            }
        }
        // adding numbers 100 - 999
        for (int i = 0; i < hundreds.length; i++) {
            allNums.add(hundreds[i]);
            for (int j = 0; j < tens.length; j++) {
                allNums.add(hundreds[i] + "and" + tens[j]);
                for (int k = 0; k < ones.length; k++) {
                    allNums.add(hundreds[i] + "and" + tens[j] + ones[k]);
                }
            }
        }
        for (int i = 0; i < hundreds.length; i++) {
            for (int j = 0; j < teens.length; j++) {
                allNums.add(hundreds[i] + "and" + teens[j]);
            }
        }
        for (int i = 0; i < hundreds.length; i++) {
            for (int j = 0; j < ones.length; j++) {
                allNums.add(hundreds[i] + "and" + ones[j]);
            }
        }
        int sum = 0;
        for (String s : allNums) {
            sum += s.length();
        }
        // add eleven to sum for one thousand
        System.out.println(sum + 11);
    }
}
