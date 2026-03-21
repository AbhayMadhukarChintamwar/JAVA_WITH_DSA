package Loops;

import java.util.Scanner;

public class PrintTheTableOfM {
    static void main(String[] args) {
        /*
        Print the Table of n upto n.
         */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

//        for (int i = m; i <= n; i=i+m) {
//            System.out.print( i+ " ");
//        }

        // 10 iteration
        for (int i = 1; i <= n; i++) {
            System.out.print( m * i+ " ");
        }
    }
}
