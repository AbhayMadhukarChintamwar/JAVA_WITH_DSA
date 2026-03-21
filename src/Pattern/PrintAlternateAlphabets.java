package Pattern;

import java.util.Scanner;

public class PrintAlternateAlphabets {
    static void main(String[] args) {

/*
    Print the given pattern
     n = 4
        a a a a
        B B B B
        c c c c
        D D D D

 */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=n ; j++) {

                if (i%2!=0)
                    System.out.print((char)(i+96) + " ");
                else
                    System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}
