package Arrays;

import java.util.Scanner;

public class ReverseArray {

    static void reverseArray(int[] arr){
        System.out.println("Reverse Array : ");
        for (int i = arr.length-1; i >=0 ; i--) {
                System.out.print(arr[i]+ " ");
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int[]  arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
                arr[i]=sc.nextInt();
        }

        System.out.println ("Original Array : ");
        for (int i = 0; i <arr.length ; i++) {
                System.out.print(arr[i] + " ");
        }
       reverseArray(arr);
}
}
