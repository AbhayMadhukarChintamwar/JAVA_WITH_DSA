package Loops;
import  java.util.Scanner;
public class APSeries {
    static void main(String[] args) {

        // Display this AP = 2,5, 8, 11 ... up to 'n' terms

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number you want to print : ");
        int n = sc.nextInt(); // numbers   10

        System.out.print("Enter first number for increasing order : ");
        int a = sc.nextInt(); // first Term   2

        System.out.print("Enter common difference : ");
        int d = sc.nextInt(); // common difference  3


//        int lastTerm = a + (n-1) *d;  // 2  + (n - 1 ) * 3;  // 3n-1;

//        System.out.print(" The AP series is : ");
//        for (int i = a; i <= lastTerm; i+=d) {
//            System.out.print(i + " ");
//        }

//

        System.out.print(" The  Increasing AP series is : ");
        for (int i = 0; i <n; i++) {
            System.out.print(a + " ");
            a += d;
        }

    }
}
