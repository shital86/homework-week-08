package hw8;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int num =13;
        boolean flag= false;
        for (int i =2;i <= num /2;++i){
            if (num % i == 0){
                flag = true;
                break;
            }
        }
        if (! flag)
        System.out.println(num + " is a Prime Number");
        else
        System.out.println(num + " Not a Prime Number");

    }
}
