package Loops;

import java.util.Scanner;

public class SumOfDigit {
    static void main(String[] args) {

        // Print sum of digit of a number
        long  x =(long) 2147483647 +10;

        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int sumOfDigits = 0;

        while (n!=0){
            sumOfDigits += n %10 ;
            n /=10;


        }
        if (sumOfDigits<0){
            sumOfDigits =-(sumOfDigits);
        }
        System.out.println(sumOfDigits);
    }
}
