package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

   public int search(int[] nums, int target) {
        int left =0;
        int right =nums.length-1;
        int index= -1;

        while(left<=right){
            int mid = (left + right)/2;
            if(nums[mid]<target) left =mid+1;
            else if(nums[mid]>target) right = mid -1;
            else{
                index = mid;
                right = mid-1;
            }
        }

        return index;
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
