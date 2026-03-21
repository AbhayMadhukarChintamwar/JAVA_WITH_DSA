package If_Else;

import java.util.Scanner;

public class SideOfATriangle {
    static void main(String[] args) {

        /*
        Take 3 positive integers input and tell if they can be the sides of a triangle or not.
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a+b>c && b+c>a && a+c>b){
            System.out.println("Valid Triangle");
        }else {
            System.out.println("Invalid Triangle");
        }
    }
}
