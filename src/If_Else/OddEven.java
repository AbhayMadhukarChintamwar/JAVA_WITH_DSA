package If_Else;

import java.util.Scanner;

public class OddEven {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        if (n % 2 != 0 ) {
            System.out.println("The value of " +  n + " is odd number");

        }else {
            System.out.println("The value of "+ n + " is even" );
        }
    }
}
