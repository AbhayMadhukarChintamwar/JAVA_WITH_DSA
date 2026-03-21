package Pattern;

import java.util.Scanner;

public class PrintMixNumberAndAlphabetPattern {
    static void main(String[] args) {

        /*
        Print the given pattern.

        n = 5
        1
        A B
        1 2 3
        A B C D
        1 2 3 4 5

         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=i ; j++) {

                if (i%2!=0)
                    System.out.print(j + " ");
                else
                    System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
