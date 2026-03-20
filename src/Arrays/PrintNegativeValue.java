package Arrays;

import java.util.Scanner;

public class PrintNegativeValue {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m =sc.nextInt();
        int n= sc.nextInt();

        int[] [] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[i][j]<0) {
                    System.out.print(arr[i][j]  + " ");
                }else {
                    System.out.print(" * ");
                }
            }
            System.out.println();

        }
    }
}
