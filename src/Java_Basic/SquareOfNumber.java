package Java_Basic;

import java.util.Scanner;

public class SquareOfNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        int number = sc.nextInt();

        int square = number * number;
        System.out.println("The Square of "+ number + " is : " + square);

    }
}
