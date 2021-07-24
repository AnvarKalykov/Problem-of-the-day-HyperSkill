/*
Circle class represents a circle. Implement Measurable interface and add a single method area that returns an area of the circle.

Note: Java has a built-in constant for the PI number: Math.PI

The class will be tested by creating an instance of Circle and invoking its area method:

Measurable circle = new Circle(1);
double area = circle.area(); // 3.14...
 */


public class AreaCircleInterface implements Measurable{
    private double radius;

    public AreaCircleInterface(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }


}


interface Measurable {
    double area();
}