package hw8;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println(isPalindrome(707));
    }
    public static boolean isPalindrome(int number){
        int reverse =0;
        int originalNumber = number;
        while (number != 0){
            int lastDigit = number % 10;
            reverse = (reverse % 10) + lastDigit;
            number /=10;
        }
     return originalNumber == reverse;
    }

}
