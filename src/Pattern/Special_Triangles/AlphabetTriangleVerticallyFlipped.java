package Pattern.Special_Triangles;

import java.util.Scanner;

public class AlphabetTriangleVerticallyFlipped {
    static void main(String[] args) {
/*
    Print the Alphabet Triangle Vertically Flipped Pattern.
       n =  5
                A
              B B
            C C C
          D D D D
        E E E E E

 */


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" "+ " ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(i+64)+ " ");

            }
            System.out.println();

        }
    }
}
