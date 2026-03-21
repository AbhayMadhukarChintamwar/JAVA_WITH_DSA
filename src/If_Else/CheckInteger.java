package If_Else;

import java.util.Scanner;

public class CheckInteger {
    static void main(String[] args) {
        // take the real number and  check it is integer number or not

        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        if (n - (int)n== 0){
            System.out.println( (int)n +" is a integer");
        }else {
            System.out.println(n +" is not a integer");

        }
    }
}
