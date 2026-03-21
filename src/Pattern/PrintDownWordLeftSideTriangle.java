package Pattern;

import java.util.Scanner;

public class PrintDownWordLeftSideTriangle {
    static void main(String[] args) {
/*
           Print the given pattern.
                n =  5
                * * * * *
                * * * *
                * * *
                * *
                *

 */

                Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <=n ; j++) {

                System.out.print( "* ");
            }

            System.out.println();
        }
    }
}
