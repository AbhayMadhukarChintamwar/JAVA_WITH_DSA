package Java_Basic;

public class ArithMeticsOperationsOnInt {
    static void main(String[] args) {

        System.out.println(" This is Int Variables");
        int a = 6;
        int b = 7;
        System.out.println( a + "  " + b);  // 6 7

        a = b;
        System.out.println( a + "  " + b);  // 7 7   in the variable of 'a' have rewrite value of  'b' in the 'a'

        a -= 10;
        b -= 11;
        System.out.println( a + "  " + b);  // -3 -4

        a *= 12;
        b *= 12;
        System.out.println( a + "  " + b);

        System.out.println(" This is Double Variables");


        double x = 30;
        double y = 9;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);


    }
}
