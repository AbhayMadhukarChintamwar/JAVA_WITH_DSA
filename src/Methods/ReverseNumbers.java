package Methods;

import java.util.Scanner;
import static java.lang.StrictMath.pow;

public class ReverseNumbers {

        static  int  counts(int n, int count ){
        while (n!=0){
            n/=10;
            count++;
        }
        return count;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int reverseNumber = 0;
        int value = counts(n,count);
        int temp =0;
        while (n!=0){
            temp = (n%10);
            n/=10;
            reverseNumber += temp *pow(10,value-1);
            value--;
        }
        System.out.println(reverseNumber);

    }
}
