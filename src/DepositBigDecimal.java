/*
Write a program to calculate the deposit.

In the input the accepted 3 values are in the following order: starting amount of money, interest rate, and the number of years during which the deposit is accrued.

The bank increases the deposit by the specified percentages every year. This can be described with the following formula:

finalAmount=startingAmount \cdot \left(1 + \frac{yearlyPercent}{100}\right)^{years}finalAmount=startingAmount⋅(1+
100
yearlyPercent

 )
years


The program should convert the entered strings to BigDecimal and calculate how much money there will be in the account after the given number years. The result should be rounded upwards, to positive infinity (CEILING mode), up to 2 (two) digits after the point.

The program should output the following string: "Amount of money in the account: <>". Instead of <> there must be the total amount of money.

It is guaranteed that all numbers are positive and the number of years is an integer.
 */


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class DepositBigDecimal {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        BigDecimal startingAmount = scanner.nextBigDecimal();
        BigDecimal interestRate = scanner.nextBigDecimal();
        int years = scanner.nextInt();

        BigDecimal part = BigDecimal.ONE.add(interestRate.divide(BigDecimal.valueOf(100))).pow(years);

        BigDecimal finalAmount = startingAmount.multiply(part);

        System.out.println("Amount of money in the account: " + finalAmount.setScale(2, RoundingMode.CEILING));
    }
}
