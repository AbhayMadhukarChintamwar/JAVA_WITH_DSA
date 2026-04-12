package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public  static  boolean binarySearch(int[] arr, int k){

        int start = 0;
        int end = arr.length-1;
        int  mid;

        while (start<=end){
            mid = (start + end)/2;
            if (arr[mid]> k){

                end = mid -1;
                mid = (start + end)/2;
                if (mid==k){
                    return true;
                }

            } else if (arr[mid]<k) {

                start = mid+1;
                mid = (start + end)/2;
                if (arr[mid]==k){
                    return true;
                }
            }

        }

       return  false;
    }
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i <arr.length ; i++) {
            arr[i]= sc.nextInt();
        }
        
        int k = sc.nextInt();

        System.out.println(binarySearch(arr, k));


    }
}
