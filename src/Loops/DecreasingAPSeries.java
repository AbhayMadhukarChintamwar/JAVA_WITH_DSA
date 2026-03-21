package Loops;

import java.util.Scanner;

public class DecreasingAPSeries {
    static void main() {

        //Print this series 99, 95, 91, 87..... up to all terms which are positive
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the value of a  ");
        int a = sc.nextInt();

        System.out.print("Enter common difference : ");
        int d = sc.nextInt();

        for (int i = a; i >0 ; i-= d) {
            System.out.print(i + " ");
        }
    }
}
