package Pattern;

import java.util.Scanner;

public class PrintLeftSideNumberTriangle {
    static void main(String[] args) {

        /*
        Print the  given triangle pattern.
        n = 4

        1
        1 2
        1 2 3
        1 2 3 4

         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

}
