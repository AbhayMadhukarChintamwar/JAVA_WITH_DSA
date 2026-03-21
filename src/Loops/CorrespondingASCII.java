package Loops;

import java.util.Scanner;

public class CorrespondingASCII {
    static void main() {
        // Print all alphabets with their corresponding ASCII values.


        Scanner sc =  new Scanner(System.in);
        int n  = sc.nextInt();

        for (int i = 0; i < 128; i++) {

            System.out.println( (char) n+ " " + n);
            n++;

        }
    }
}
