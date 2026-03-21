package Pattern.HollowPattern;

import java.util.Scanner;

public class StarProduct {

    static void main(String[] args) {

        /*
        Print the given pattern if n is odd.
          n =  5

                *           *
                   *     *
                      *
                   *      *
                *            *


         */

                Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i==j || n-i+1==j){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
