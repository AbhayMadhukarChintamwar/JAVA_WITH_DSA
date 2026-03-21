package Pattern;

import java.util.Scanner;

public class SquareStarPattern {
    static void main(String[] args) {

        // Print the Square Pattern

        /*
        n =5 ;
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

         */


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
