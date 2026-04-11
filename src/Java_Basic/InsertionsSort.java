
package JavaBasic.LinearSearch;
import java.util.Scanner;

public class InsertionsSort{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int n = sc.nextInt();
     int [] arr = new int[n];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]= sc.nextInt();
        }

        for(int ele: arr){
            System.out.print(ele+ " ");
        }

        System.out.println();

        for (int i = 1; i <arr.length ; i++) {
            int j = i;
            while (j>0 && arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
            }
        }

        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}

