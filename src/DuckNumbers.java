/*
Objectives
Your program should print the properties of a natural number. In this stage, your program should:

Ask a user to enter a natural number;
If the number is not natural, the program should print an error message;
If the number is natural, the program should indicate the properties of the number;
Finish the program after printing the message.
 */


import java.util.Scanner;

public class DuckNumbers {
    public static void main(String[] args) {
//        write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int someNumber = scanner.nextInt();
        numberNatOrNot(someNumber);
    }

    public static void numberNatOrNot(int someNumber) {
        if (someNumber < 1) {
            System.out.println("This number is not natural!");
        } else {
            checkNumbers(someNumber);

        }
    }

    public static void checkNumbers(int someNumber) {
        System.out.printf("Properties of %d", someNumber);
        System.out.println();
        System.out.println("even: " + even(someNumber));
        System.out.println("odd: " + odd(someNumber));
        System.out.println("buzz: " + buzz(someNumber));
        System.out.println("duck: " + duck(someNumber));
    }

    public static boolean even(int someNumber) {
        return someNumber % 2 == 0;
    }

    public static boolean odd(int someNumber) {
        return someNumber % 2 != 0;
    }

    public static boolean buzz(int someNumber) {
        return someNumber > 0 && someNumber % 7 == 0 || someNumber % 10 == 7;
    }

    public static boolean duck(int someNumber) {
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
}
