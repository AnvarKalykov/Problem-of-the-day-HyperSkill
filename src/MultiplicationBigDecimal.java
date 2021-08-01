/*
Write a program that takes two strings as input, converts them to BigDecimal numbers, multiplies them, and prints the result.
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class MultiplicationBigDecimal {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        BigDecimal a = new BigDecimal(scanner.next());
        BigDecimal b = new BigDecimal(scanner.next());

        System.out.println(a.multiply(b));
    }
}
