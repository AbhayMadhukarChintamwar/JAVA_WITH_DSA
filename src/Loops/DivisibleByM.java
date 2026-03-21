package Loops;

import java.util.Scanner;

public class DivisibleByM {
    static void main(String[] args) {
        /*
        Print all odd numbers divisible by m from 1 to n
         */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i <n ; i++) {
            if (i  % 2 != 0 &&  i % m == 0 ){
                System.out.print(i + " ");
            }
        }
    }
}
