/*
Given the radius of a circle, you need to find the area of that circle. Use this formula:

S = \pi R^2S=πR
2


where SS is the area of a circle, \piπ is a Math.PI constant, and RR is the radius of the circle.
 */


import java.util.Scanner;

public class AreaCircle  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double r = scanner.nextDouble();
        System.out.println(Math.PI * Math.pow(r, 2));
    }
}
