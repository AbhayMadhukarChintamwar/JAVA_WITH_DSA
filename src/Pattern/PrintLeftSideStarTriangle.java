package Pattern;

import java.util.Scanner;

public class PrintLeftSideStarTriangle {
    static void main(String[] args) {
/*
               Print the given pattern
               n =4
                *
                * *
                * * *
                * * * *

 */
                Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
