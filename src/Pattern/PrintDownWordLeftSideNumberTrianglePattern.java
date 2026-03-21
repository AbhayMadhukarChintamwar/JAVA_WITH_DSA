package Pattern;

import java.util.Scanner;

public class PrintDownWordLeftSideNumberTrianglePattern {
    static void main(String[] args) {

    /*
        Print the given pattern.
        n = 5
        1 2 3 4 5
        2 3 4 5
        3 4 5
        4 5
        5

     */
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();

        }
    }
}
