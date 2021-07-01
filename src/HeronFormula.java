/*
Many years ago when Paul went to school, he did not like the Heron's formula to calculate the area of a triangle,
because he considered it very complex. Once he decided to help all school students and write and distribute
a program calculating the area of a triangle by its three sides.

However, there was a problem: as Paul did not like the formula, he did not memorize it. Help him finish this act of kindness
and write the program calculating the area of a triangle with the known length of its sides, in accordance with Heron's formula:

S=\sqrt{p(p−a)(p−b)(p−c)}
S=
p(p−a)(p−b)(p−c)
​

where p=\dfrac{a+b+c}2p=
2
a+b+c
​
  is the half-perimeter of the triangle. In the input, the program has integers, and the output should be a real number corresponding to the area of the triangle.

 */


import java.util.Scanner;

public class HeronFormula {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double s;
        double p;
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        p = (a + b + c) / 2;

        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(s);
    }
}