package Pattern.Special_Triangles;

import java.util.Scanner;

public class FloydsTriangle {
    static void main(String[] args) {

/*
    Print the Floyd's Triangle
        n = 4
        1
        2 3
        4 5 6
        7 8 9 10

 */
        Scanner sc  = new Scanner(System.in);
        int n   = sc.nextInt();
        int m=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
//                System.out.print((j+i-1)+" ");
                System.out.print(m++ +" ");
//                m++;

            }
            System.out.println();
        }
    }
}
