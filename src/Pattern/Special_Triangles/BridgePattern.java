package Pattern.Special_Triangles;

import java.util.Scanner;

public class BridgePattern {
   /*
   Print the Bridge Pattern.
   n = 5
            * * * * * * * * *
            * * * *   * * * *
            * * *       * * *
            * *           * *
            *               *


    */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j<= n+1-i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }for (int j = 2; j <=n ; j++) {
                if (j>=i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
