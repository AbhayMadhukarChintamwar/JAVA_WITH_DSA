package Pattern.HollowPattern;

import java.util.Scanner;

public class StarPlus {
    static void main(String[] args) {

/*
Print the given pattern if n is odd.
              n = 5
                      *
                      *
                *  *  *  *  *
                      *
                      *

 */

                Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (n/2 +1==j || n/2 +1==i)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
