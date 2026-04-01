package Arrays;
import java.util.Scanner;

public class SumOfArray {
    static int sumOfArray(int[] arr){
    int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        sum  = arr[i] +sum;
    }
        return sum;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        int x =sumOfArray(arr);
        System.out.println(x);
    }
}
