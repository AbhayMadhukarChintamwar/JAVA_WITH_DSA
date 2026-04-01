package Arrays;
import java.util.Scanner;

public class TwoDReverseArray {

    static void ReverseTwoDArray(int[][] arr){

        System.out.println(" Reverse 2 D Array ");

        for (int i = arr.length-1; i >=0 ; i--) {
            for (int j = arr.length-1; j >=0 ; j--) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

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

        System.out.println(" 2 D Array ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]  + " ");
            }
            System.out.println();

        }

        ReverseTwoDArray(arr);

    }
}
