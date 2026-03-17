package Java_Basic;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int value = s.nextInt();

        for(int i =1; i<=value; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        int a = 0;
        while(a<value){
            System.out.print(a + " ");
            a++;
        }

    }
}
