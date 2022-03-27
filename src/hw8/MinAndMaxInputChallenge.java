package hw8;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.println("Enter Number: ");
            int val = sc.nextInt();
            if(val == -1){
                break;
            }
            if (val < min){
                min = val;
            }
            if (val> max){
                max = val;
            }
        }
        System.out.println("Minimum Number: " +min);
        System.out.println("Maximum Number: " +max);
    }
}
