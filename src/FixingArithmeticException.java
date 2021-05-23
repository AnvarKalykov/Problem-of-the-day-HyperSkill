/*
Here is a program that reads numbers and performs some calculations. It outputs the result to the standard output.

In some cases, the program will throw an ArithmeticException.
Fix the program so that it prints "Division by zero!" instead of this exception.
 */

import java.util.Scanner;

class FixingArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        try {
            int result = a / ((b + c) / d);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        }




    }
}