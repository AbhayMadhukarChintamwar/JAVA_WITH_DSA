package Loops;

import java.util.Scanner;

public class FactorialNumber {

    static void main(String[] args) {

        // print a factorial numbers

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long factorial = 1;

        for (int i = 1; i <=n; i++) {
            factorial *= i;
            System.out.print(factorial +  " ");

        }


        System.out.println(factorial);
    }
}
