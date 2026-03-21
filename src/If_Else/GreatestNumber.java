package If_Else;

import java.util.Scanner;

public class GreatestNumber {
    static void main(String[] args) {
              /*
        Take 3 positive integers input and print the greatest of them.
         */

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>= b && a>=c){
            System.out.println(a);
        }else if (b>=a && b>=c){
            System.out.println(b);

        }else {
            System.out.println(c);

        }




    }
}
