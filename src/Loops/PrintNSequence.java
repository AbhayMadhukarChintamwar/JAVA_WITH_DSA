package Loops;

import java.util.Scanner;

public class PrintNSequence {
    static void main(String[] args) {
        // Take 'n' as input from user and prit the following  sequence.
        // 1 n 2 n-1 3 n-2 ....

        Scanner sc = new Scanner(System.in);

        int n    = sc.nextInt();
        int m  = n/2 +1;

        for (int i = 1; i <= m; i++) {
                System.out.println(i);
                System.out.println(n-i+1);
        }
    }
}
