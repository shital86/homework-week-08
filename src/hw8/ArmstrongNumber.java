package hw8;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int cube=0;
       int check;
       int remainder;
       int n= sc.nextInt();
       check=n;
       int original=n;

        while(n>0){
            remainder =n % 10;
            n =n/10;
            cube = cube+(remainder*remainder*remainder);

        }
        if (check == cube)
            System.out.println(original+ " is an Armstrong number. ");
        else
            System.out.println(original+ " is not an Armstrong number. ");
    }
}
