// write a program to find area of rect, square and circle using method overloading
// had this today in my test xD

public class Shape {

    public int area(int length, int width) {
        return length * width;
    }

    public int area(int side) {
        return side * side;
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();

        int rectangleLength = 10;
        int rectangleWidth = 5;
        int rectangleArea = shape.area(rectangleLength, rectangleWidth);
        System.out.println("Area of the rectangle: " + rectangleArea);

        int squareSide = 4;
        int squareArea = shape.area(squareSide);
        System.out.println("Area of the square: " + squareArea);

        double circleRadius = 7.0;
        double circleArea = shape.area(circleRadius);
        System.out.println("Area of the circle: " + circleArea);
    }
}
