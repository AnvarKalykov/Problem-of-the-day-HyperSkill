/*
You are given real numbers a, b and c, where a ≠ 0.

Solve the quadratic equation ax^2 + bx + c = 0ax
2
 +bx+c=0 and output all of its roots.

It is guaranteed that the equation always has two roots.

Output the results roots in ascending order. Do not round or format them, the testing system does it automatically.
 */

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double determinant = b * b - 4 * a * c;

        double root1;
        double root2;



        // two real and distinct roots
        root1 = (-b + Math.sqrt(determinant)) / (2 * a);
        root2 = (-b - Math.sqrt(determinant)) / (2 * a);

        if (root2 < root1) {
            System.out.println(root2 + " " + root1);
        } else {
            System.out.println(root1 + " " + root2);
        }



    }
}