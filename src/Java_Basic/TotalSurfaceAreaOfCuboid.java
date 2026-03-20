package Java_Basic;

import java.util.Scanner;

public class TotalSurfaceAreaOfCuboid {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double height = sc.nextDouble();

        double $_totalSurfaceAreaOfCuboid = 2 * (length * breadth  + breadth * height + length* height);
        System.out.println($_totalSurfaceAreaOfCuboid);
    }
}
