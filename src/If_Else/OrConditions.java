package If_Else;

import java.util.Scanner;

public class OrConditions {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        if (n % 3 == 0 || n % 5 == 0){
            System.out.println(n + " is divisible by 3 or 5 ");
        }else {
            System.out.println(n + " is  not divisible by 3 or 5 ");

        }
    }
}
