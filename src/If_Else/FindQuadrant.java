package If_Else;

import java.util.Scanner;

public class FindQuadrant {
    static void main(String[] args) {
        /*
        Given a point (x,y), write a program to find out if it lies in the 1st Quadrant, 2nd Quadrant, 3rd Quadrant,
        4th Quadrant, on the X-axis, Y-axis or the origin.
         */

        Scanner sc = new  Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x<0 && y>0){
            System.out.println(" point(x,y) lies in the 1st Quadrant");
        }else if (x>0 && y > 0){
            System.out.println(" point(x,y) lies in the 2nd Quadrant");
        } else if (x<0 && y<0) {
            System.out.println(" point(x,y) lies in the 3rd Quadrant");
        } else if (x>0 && y< 0) {
            System.out.println(" point(x,y) lies in the 4th Quadrant");
        } else if (x ==0 & y !=0) {
            System.out.println(" point(x,y) lies on the Y-axis");
        }else if (x != 0 && y == 0){
            System.out.println(" point(x,y) lies on the X-axis");

        }else {
            System.out.println(" point(x,y) lies on the Origin");

        }
    }
}
