package If_Else;

import java.util.Scanner;

import static java.lang.System.*;

public class Magnitude {
    static void main(String[] args) {
        /* Take integer input and tell if its magnitude is smaller than 69 or not.
         ie  n =-34  |-34| < 69 ie 34 < 69 */

        Scanner sc = new Scanner(in);
        int n  = sc.nextInt();
         int m = sc.nextInt();

        if (n < 0){
            n = -n;
            if (n < m){
                out.println(n + " magnitude is smaller than " + m );
            }else if ( n > m){
                out.println(n + " magnitude is greater than " + m );

            }else {
                out.println(n + " magnitude is same " + m );

            }
        }
        else if ( n < m){
            out.println(n + " magnitude is smaller than " + m );

        }else if (n > m){
            out.println(n + " magnitude is greater than " + m );

        }else {
            out.println(n + " magnitude is same " + m );

        }
    }
}
