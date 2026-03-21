package Pattern;

import java.util.Scanner;

public class PrintDWLSAlphabetTP {
    static void main(String[] args) {

        /*

        Star Triangle Horizontally Flipped

        Print the given pattern.

        n = 5
        A B C D E
        B C D E
        C D E
        D E
        E

         */
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print((char)(j+64)+ " ");
            }
            System.out.println();
        }
    }
}
