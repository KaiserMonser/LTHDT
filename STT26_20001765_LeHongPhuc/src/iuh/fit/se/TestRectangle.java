package iuh.fit.se;
/**
 * @description:  This class represents a rectangle with length and width, providing methods to calculate area and perimeter.
 * @author:  Phuc, Le Hong phuc
 * @version: 1.0
 * @created: 25-08-2024
 */
public class TestRectangle {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20.5, 4.0);

         System.out.println("Length r1:" + r1.getLength());
         System.out.println("Length r2:" + r2.getLength());

         System.out.println("Area r2: " + r2.getArea());
         System.out.println("Perimeter r2: " + r2.getPerimeter());

    }
}
