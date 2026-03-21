package Loops;

import java.util.Scanner;


public class ReverseNumber {



    static void main(String[] args) {

        // Reverse of a number

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverseNumber = 0;
        int temp =0;


        while (n!=0){
            temp = n%10;
            n/=10;
            reverseNumber=  (reverseNumber*10) + temp;

        }
        System.out.println(reverseNumber);
    }
}
