package Java_Basic;

public class Charecters {
    static void main(String[] args) {

        char ch = 'A';
        int x  = ch; // implicit typecasting
        System.out.println(x);  // print ASCII value of A = 65


        char y = 'a';
        int  z = (int)y; //explicit typecasting
        System.out.println(z);  // print ASCII value of a = 97

        char charecter = '0';
        System.out.println((int)charecter);  // print ASCII value of 0 =  48


        System.out.println((int)charecter + x + z);   // print the addition of  ASCII value of A,a and 0 (ie A + a + 0) = 65 + 97 +48 = 210

        char value = '1';
        System.out.println(value + 0); // print ASCII value of 1 = 49

        int values = 65;
        char chars = (char)values; // explicit typecasting
        System.out.println(chars); // print charecter value by using ASCII  values




    }

}
