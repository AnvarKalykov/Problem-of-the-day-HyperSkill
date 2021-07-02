/*
Find X
Write a program that reads three double values a, b, c, and then solves the simple equation:

a * x + b = c
The program should output the value of x.

It's guaranteed that a is not 0.


Sample Input:
2 -1 2

Sample Output:
1.5
 */


import java.util.Scanner;

public class FindX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double x = (c - b) / a;
        System.out.println(x);


    }
}
