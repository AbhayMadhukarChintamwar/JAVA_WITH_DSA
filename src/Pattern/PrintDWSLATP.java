package Pattern;

import java.util.Scanner;

public class PrintDWSLATP {
    static void main(String[] args) {

        /*
        Print the given pattern

        n = 5
        a b c d e
        a b c d
        a b c
        a b
        a

         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n+1-i ; j++) {
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
