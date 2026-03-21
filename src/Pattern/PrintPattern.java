package Pattern;

import java.util.Scanner;

public class PrintPattern {
    static void main(String[] args) {
        // print a given patter
        //  row = 5
        // column = 6
       /*       * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
       */

                Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();


        for (int i = 0; i <row; i++) {

            for (int j = 0; j < column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
