package hw8;

public class DigitSumChallenge {
    public static void main(String[] args) {

        System.out.println(sumDigits(678));
    }

    public static int sumDigits(long n) {


        int result = 0;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
