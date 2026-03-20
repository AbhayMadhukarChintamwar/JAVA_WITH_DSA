package Java_Basic;

import java.util.Scanner;

public class SimpleIntrest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principle = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double simpleIntrest = ( principle * rate * time )/100;
        System.out.println("The value of Simple intrest is :  "+ simpleIntrest);
        double totalIntrest = principle + simpleIntrest;
        System.out.println("The addition of Total intrest is  :  "+ totalIntrest);
    }
}
