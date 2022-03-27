package hw8;

public class Fibonacci {
    public static void main(String[] args) {
        int maxNumber =9;
        int previousNumber=0;
        int nextNumber =1;
        System.out.println("Fibonacci Series of " +maxNumber+ " numbers: ");
        for (int i=1;i<=maxNumber;++i){
            System.out.println(previousNumber+ " ");
            int sum = previousNumber +nextNumber;
            previousNumber =nextNumber;
            nextNumber =sum;
        }
    }
}
