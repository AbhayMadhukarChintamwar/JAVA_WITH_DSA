package Loops;

import java.util.Scanner;

public class GPSeries {

    static void main(String[] args) {
        // Display this GP -  1, 2, 4, 8... upto n terms.

        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        int a  = sc.nextInt();
        int r = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            System.out.print(a + " ");
            a *= r;

        }
    }
}
