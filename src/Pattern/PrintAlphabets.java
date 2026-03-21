package Pattern;

import java.util.Scanner;

public class PrintAlphabets {

    static void main(String[] args) {

        /*
        Print the given pattern
         n = 4
        A A A A
        B B B B
        C C C C
        D D D D

         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=n ; j++) {

                System.out.print((char)(i+64) + " ");

            }
            System.out.println();
        }
    }
}
