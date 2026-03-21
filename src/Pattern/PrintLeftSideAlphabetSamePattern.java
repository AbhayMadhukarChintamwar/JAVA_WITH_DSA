package Pattern;

import java.util.Scanner;

public class PrintLeftSideAlphabetSamePattern {

    static void main(String[] args) {

        /*
        Print the given pattern.
        n = 5
        A
        B B
        C C C
        D D D D
        E E E E E

         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
