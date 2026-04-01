package Java_Basic;
import java.util.Scanner;

public class Functions {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = s.nextInt();

        System.out.println("Enter the value of n ");

        int m = s.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Enter the value of array ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) { 
                arr[i][j]  = s.nextInt();  
            }

        }
        for(int i = 0; i<arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
 

        // System.out.println(Arrays( arr));



    }

    // static int Arrays(int[] arr){

    //     System.out.println("The g value of array is : ");
    //     for (int i = 0; i < arr.length; i++) {
    //         return arr[i];
    //     }
    //     return 0;
    // }
}
      