package Java_Basic;

import java.util.Scanner;

public class AreaOfCircle {
    static void main(String[] args) {
        // Area of Circle
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double pie = 3.141592;
        double areaOfCircle = pie * radius *  radius;

        System.out.println(areaOfCircle);
    }
}
