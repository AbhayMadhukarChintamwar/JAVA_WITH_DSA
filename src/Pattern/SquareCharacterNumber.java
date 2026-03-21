package Pattern;

import java.util.Scanner;

public class SquareCharacterNumber {
    static void main(String[] args) {

        /*
        print the Square Characters
        n = 5;
        A B C D E
        A B C D E
        A B C D E
        A B C D E
        A B C D E
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=n ; j++) {

                System.out.print((char)(j+64)+ " ");

            }
            System.out.println();
        }
    }
}
