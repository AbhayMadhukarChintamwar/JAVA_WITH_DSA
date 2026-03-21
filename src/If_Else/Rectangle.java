package If_Else;
import java.util.Scanner;
public class Rectangle {
    static void main(String[] args) {
        /*
        Take length and breadth of rectangle as input and write a program to find whether the area of rectangle is
        greater than its perimeter.
         */

Scanner sc  = new Scanner(System.in);
int  length = sc.nextInt();
int  breath = sc.nextInt();
int AreaOfRectangle =  length * breath;
int PerimeterOfRectangle = 2 *( length + breath);

if (AreaOfRectangle > PerimeterOfRectangle){
    System.out.println("Area of retangle " + AreaOfRectangle+" is greater than Perimeter of  Rectangle " + PerimeterOfRectangle);
}else {
    System.out.println("Area of retangle " + AreaOfRectangle+" is lesser than Perimeter of  Rectangle " + PerimeterOfRectangle);

        }
    }
}
