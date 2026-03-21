package Pattern.Special_Triangles;

import java.util.Scanner;

public class VerticallyFlippedTriangle {

    static void main(String[] args) {

              /*
              Print the vertical flipped triangle
    n = 4
      *
    * *
  * * *
* * * *

               */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" "+ " ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+ " ");

            }
            System.out.println();

        }
    }
}
