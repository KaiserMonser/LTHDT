package iuh.fit.se;
/**
 * @description:  This class represents a rectangle with length and width, providing methods to calculate area and perimeter.
 * @author:  Phuc, Le Hong phuc
 * @version: 1.0
 * @created: 25-08-2024
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width > 0");
        }
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    /**
     *
     * @param width
     */

    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width > 0");
        }
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}
