package Arrays;
import java.util.Scanner;
public class MaxValue {
    static int max(int[] arr, int start, int end){

        if (arr.length ==0) {
            return -1;
        }
        int maxVal = arr[start];
        for (int i = 0; i <= end; i++) {
            if (arr[i]>maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

     static void main(String[] args) {
        Scanner s   = new Scanner(System.in);
        int n = s.nextInt();
        int[]  arr = new int[n];
        int start= s.nextInt();
        int end = s.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(max(arr, start, end));

    }
}
