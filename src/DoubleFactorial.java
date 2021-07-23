/*
Implement a function to compute the double factorial. It is the product of natural numbers of the same parity,
not exceeding a given number.

For example:
7!!=7⋅5⋅3⋅1
8!!=8⋅6⋅4⋅2

The function argument can be any non-negative integer.

Use BigInteger to solve the problem.
 */


import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        // type your java code here
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            return calcDoubleFactorial(n - 2).multiply(BigInteger.valueOf(n));
        }

    }
}