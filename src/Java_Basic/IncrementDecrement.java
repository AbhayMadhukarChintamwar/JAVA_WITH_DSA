package Java_Basic;

import java.util.Scanner;

public class IncrementDecrement {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); //5
        int y = sc.nextInt(); //6

        System.out.println(x++); //5
        System.out.println(++x); //7
        System.out.println(++y); //7
        System.out.println(y++); //7
        System.out.println(--x); //6
        System.out.println(x--); //6
        System.out.println(--y); //7
        System.out.println(y--); //7
        x = x-- - ++y;
        System.out.println(x); //-2
        y = --x + y--;
        System.out.println(y); //4
        System.out.println(x+y); //1
        System.out.println(x-y); //-7


    }
}
