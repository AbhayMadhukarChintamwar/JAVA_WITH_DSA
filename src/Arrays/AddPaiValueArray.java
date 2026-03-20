package Arrays;

import java.util.Scanner;

public class AddPaiValueArray {
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
                System.out.print(arr[i][j] *3.14  + " ");
            }
            System.out.println();

        }



    }
}
