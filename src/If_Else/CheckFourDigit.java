package If_Else;

import java.util.Scanner;

public class CheckFourDigit {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n  = sc.nextInt();

        if (999 < n && n < 10000){
            System.out.println(n + " a four digit number");
        }else {
            System.out.println(n + " not  a four digit number");

        }
    }
}
