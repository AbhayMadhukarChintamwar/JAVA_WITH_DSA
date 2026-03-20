package Java_Basic;

import java.util.Scanner;

public class VolumeOfSphere {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double pie  = 3.14;
        double volumeOfSphere = 4/3 * pie * radius * radius * radius;
        System.out.println(volumeOfSphere);
    }
}
