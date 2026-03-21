package Pattern;

import java.util.Scanner;

public class SquareSmallAlphabet {
    static void main(String[] args) {
/*
    print a small alphabet square pattern
     n = 5;

        a b c d e
        a b c d e
        a b c d e
        a b c d e
        a b c d e

 */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=n ; j++) {

                System.out.print((char)(j+96)+ " ");

            }
            System.out.println();
        }
    }
}
