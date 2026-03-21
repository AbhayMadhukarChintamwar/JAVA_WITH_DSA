package If_Else;
import  java.util.Scanner;
public class NestedIfElse {
    static void main(String[] args) {
        /*
        Take 3 positive integers input and print the greatest of them, without using AND(&&) and OR(||).
         */

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>=b){

            if (a>=c){
                System.out.println( a);
            }else {
                System.out.println( c);
            }
        } else {

            if (b>=c){
                System.out.println( b);

            }else
            {
                System.out.println( c);
            }


        }



    }
}
