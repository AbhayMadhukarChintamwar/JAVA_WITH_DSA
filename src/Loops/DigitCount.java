package Loops;

import java.util.Scanner;

public class DigitCount {
    static void main(String[] args) {

        // Write a program which can prin a number of digit.

        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int count = 0;

        if (n == 0){
               count = 1;
        }

        while (n!=0){
            n /= 10;
            count++;
        }

        System.out.println(count);
    }
}
