package Loops;

import java.util.Scanner;

public class PrintEvenNumber {
    static void main(String[] args) {

        /*
        Print all even numbers from 0 to n
         */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        // its takes n iterations
//        for (int i  = 0 ;  i < n; i++){
//                if (i % 2 == 0){
//             System.out.print(i + " ");
//            }
//        }



//    its takes n/2 iterations
        for (int i = 0; i <= n; i=i+2) {

              System.out.print(i + " ");

        }

    }
}
