package Pattern.Special_Triangles;

import java.util.Scanner;

public class OddNumberTriangle {
    static void main(String[] args) {
/*
    Print the Odd Number Triangle
       n = 4
        1
        1 3
        1 3 5
        1 3 5 7

 */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        for (int i = 1; i <= n; i++) {
           a = 1;
         for (int j = 1; j <= n; j++) {
                if (i>=j){
                    System.out.print(a+ " ");
                    a+= 2;

                }

            }
            System.out.println();

        }
    }
}
