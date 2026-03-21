package If_Else;
import java.util.Scanner;

public class PrintDivisibleValue {
    static void main(String[] args) {
        /* Take positive integer input and print:
        Divided by 5  if number is divisible by 5
        Divided by 3  if number is divisible by 3
        Divided by 3 & 5 both if number is divisible by 3 & 5 both
        Not divisible by 3 & 5 if number is not divisible by 3 &5
         */

        Scanner sc  = new Scanner(System.in);

        int number = sc.nextInt();

        if (number % 3 == 0 && number % 5 ==0){
            System.out.println(number +  " is Divided by 3 & 5 both");
        }else if (number % 3 == 0 ){
            System.out.println(number +  " is Divided by 3");


        }else if (number % 5 ==0){
            System.out.println(number +  " is Divided by  5 ");

        }else {
            System.out.println(number +  " is Not divided by 3 & 5 both");

        }


    }
}
