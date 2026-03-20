package Arrays;

import javax.naming.PartialResultException;
import java.util.Scanner;

public class SumOfArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
             sum  = arr[i] +sum;
        }
        System.out.println(sum);
    }
}
