/*
Objectives
In this stage, your program should:

Welcome users;
Display the instructions;
Ask for a request;
Terminate the program if a user enters zero;
If a number is not natural, print an error message;
Print the properties of the natural number;
Continue execution from step 3, after the request has been processed.
The properties are even, odd, buzz , duck and palindromic. The tests won't check the order of properties,
indentation, and spaces.
You may format numbers as you like. Please, add the information below

 */

import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
//        write your code here
        Scanner scanner = new Scanner(System.in);
        long someNumber;
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println();
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter 0 to exit.");
        System.out.println();

        do {
            System.out.println("Enter a request:");
            someNumber = scanner.nextLong();
            if (someNumber < 0) {
                System.out.println("The first parameter should be a natural number or zero.");
            } else if (someNumber == 0){
                System.out.println("Goodbye!");
            } else {
                checkNumbers(someNumber);
            }

        } while (someNumber != 0);




    }

    public static void numberNatOrNot(long someNumber) {
        if (someNumber < 0) {
            System.out.println("This number is not natural!");
        } else {
            checkNumbers(someNumber);

        }
    }

    public static void checkNumbers(long someNumber) {
        System.out.printf("Properties of %d", someNumber);
        System.out.println();
        System.out.println("even: " + even(someNumber));
        System.out.println("odd: " + odd(someNumber));
        System.out.println("buzz: " + buzz(someNumber));
        System.out.println("duck: " + duck(someNumber));
        System.out.println("palindromic: " + palindromic(someNumber));
        System.out.println();
    }

    public static boolean even(long someNumber) {
        return someNumber % 2 == 0;
    }

    public static boolean odd(long someNumber) {
        return someNumber % 2 != 0;
    }

    public static boolean buzz(long someNumber) {
        return someNumber > 0 && someNumber % 7 == 0 || someNumber % 10 == 7;
    }

    public static boolean duck(long someNumber) {
        String numWord = String.valueOf(someNumber);
        int l = numWord.length();
        int ctr = 0;
        char chr;

        for(int i=1;i<l;i++) {
            chr = numWord.charAt(i);
            if(chr=='0')
                ctr++;
        }

        char f = numWord.charAt(0);

        return ctr > 0 && f != '0';

    }

    public static boolean palindromic(long someNumber) {
        String numWord = String.valueOf(someNumber);
        int len = numWord.length();
        for (int i = 0; i < len / 2; i++) {
            if (numWord.charAt(i) != numWord.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
