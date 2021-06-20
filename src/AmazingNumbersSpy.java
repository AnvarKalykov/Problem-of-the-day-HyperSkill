/*
Objectives
Your program should process the user requests. In this stage, your program should:

Welcome users;
Display the instructions;
Ask for a request;
If a user enters zero, terminate the program;
If numbers are not natural, print an error message;
If a user inputs an incorrect property, print the error message and the list of available properties;
For one number, print the properties of the number;
For two numbers, print the list of numbers with their properties;
For two numbers and a property, print the list of numbers and their properties filtered by the indicated property;
Once a request is processed, continue execution from step 3.
In the current stage, the property names include even, odd, buzz, duck, palindromic , gapful, and spy.
The test won't check the order of properties, their indentation, and spaces. You may format numbers as you like.
 */

import java.util.*;

public class AmazingNumbersSpy {
    private static final Scanner S = new Scanner(System.in);
    private static NumberProperties properties;

    public static void main(String[] args) {
        printIntro();
        properties = new NumberProperties();
        properties.setNumber(-1);
        while(properties.getNumber() != 0) {
            System.out.println("Enter a request:");
            handleInput();
        }
    }
    static void printIntro() {
        System.out.println("Welcome to Amazing Numbers!\n\n" +
                "Supported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter two natural numbers to obtain the properties of the list:\n" +
                "  * the first parameter represents a starting number;\n" +
                "  * the second parameters show how many consecutive numbers are to be processed;\n" +
                "- two natural numbers and a property to search for;" +
                "- separate the parameters with one space;\n" +
                "- enter 0 to exit.\n");
    }
    static void handleInput() {
        String str = S.nextLine().trim();            //remove leading and trailing spaces
        String s = str.replaceAll("\\s+"," ");       //replace multiple spaces with ONE
        if (s.contains(" ")) {
            String[] params = s.split(" ");
            if (params[0].matches("\\d+") && params[1].matches("\\d+")) {
                long num1 = Long.parseLong(params[0]);
                long num2 = Long.parseLong(params[1]);
                if (params.length == 2)
                    checkNumbers(num1, num2);
                else if (params.length == 3) {
                    String p = params[2];
                    checkNumbers(num1, num2, p);
                }
            } else
                System.out.println("The second parameter should be a natural number.");
        } else
            checkNumber(s);
    }
    static void checkNumbers(long num1, long num2) {
        for (long i = 0; i < num2; i++) {
            properties.setNumber(num1);
            properties.checkProperties();
            properties.printPropertiesInOneLine();
            num1++;
        }
    }
    static void checkNumbers(long num1, long num2, String p) {
        if (isNotValidProperty(p)) {
            System.out.printf("The property [%s] is wrong.\n", p);
            System.out.println("Available properties: [BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, EVEN, ODD]");
        } else {
            for (int i = 0; i < num2; i++) {
                num1 = findNumberWithProperty(num1, p);
                properties.checkProperties();
                properties.printPropertiesInOneLine();
                num1++;
            }
        }
    }
    static boolean isNotValidProperty(String p) {
        return !p.equalsIgnoreCase("even") && !p.equalsIgnoreCase("odd") && !p.equalsIgnoreCase("duck")
                && !p.equalsIgnoreCase("buzz") &&  !p.equalsIgnoreCase("palindromic")
                && !p.equalsIgnoreCase("gapful") && !p.equalsIgnoreCase("spy");
    }
    static long findNumberWithProperty(long n, String p) {
        boolean val = checkProperty(n, p);
        while (!val) {
            n++;
            val = checkProperty(n, p);
        }
        return n;
    }
    static boolean checkProperty(long n, String p) {
        properties.setNumber(n);
        return properties.checkProperty(p);
    }
    static void checkNumber(String s) {
        if (s.matches("\\d+")) {
            long number = Long.valueOf(s);
            properties.setNumber(number);
            if (properties.getNumber() != 0) {
                properties.checkProperties();
                properties.printProperties();
            }
        } else
            System.out.println("The first parameter should be a natural number or zero.");
    }
}

class NumberProperties {
    private long number;
    private Set<String> trueProperties;

    NumberProperties() {trueProperties = new HashSet<>();}
    long getNumber() {return number;}
    void setNumber(long n) { number = n;}

    boolean checkProperty(String p) {
        switch (p.toLowerCase()) {
            case "even" : return checkParity();
            case "odd" :  return !checkParity();
            case "buzz" : return checkBuzziness();
            case "duck" : return checkDuckness();
            case "palindromic" : return checkIsPalindromic();
            case "gapful" : return checkIsGapful();
            case "spy" : return checkIsSpy();
        }
        return false;
    }
    void checkProperties() {
        trueProperties = new HashSet<>();
        trueProperties.add(checkParity() ? "even" : "odd");
        trueProperties.add(checkBuzziness() ? "buzz" : null);
        trueProperties.add(checkDuckness() ? "duck" : null);
        trueProperties.add(checkIsPalindromic() ? "palindromic" : null);
        trueProperties.add(checkIsGapful() ? "gapful" : null);
        trueProperties.add(checkIsSpy() ? "spy" : null);
    }
    boolean checkParity() {return number % 2 == 0;}
    boolean checkBuzziness() {return number % 7 == 0 || number % 10 == 7;}
    boolean checkDuckness() {
        String num = String.valueOf(number);
        for (int i = 0; i < num.length(); i++) {
            if (i != 0 && num.charAt(i) == '0') {
                return true;
            }
        }
        return false;
    }
    boolean checkIsPalindromic() {
        String num = String.valueOf(number);
        String reversedNum = "";
        for (int i = num.length() - 1; i >= 0; i--)
            reversedNum += num.charAt(i);
        return num.equals(reversedNum);
    }
    boolean checkIsGapful() {
        if (number > 99) {
            String num = String.valueOf(number);
            char first = num.charAt(0);
            char last = num.charAt(num.length() - 1);
            String n = first + "" + last;
            int div = Integer.parseInt(n);
            if (number % div == 0)
                return true;
        }
        return false;
    }
    boolean checkIsSpy() {
        String[] digits = String.valueOf(number).split("");
        int sum = 0;
        int product = 1;
        for (String digit : digits) {
            int d = Integer.parseInt(digit);
            sum = sum + d;
            product = product * d;
        }
        return sum == product;
    }
    void printProperties() {
        System.out.printf("Properties of %d\n", number);
        System.out.println("even: " + trueProperties.contains("even"));
        System.out.println("odd: " + trueProperties.contains("odd"));
        System.out.println("buzz: " + trueProperties.contains("buzz"));
        System.out.println("duck: " + trueProperties.contains("duck"));
        System.out.println("palindromic: " + trueProperties.contains("palindromic"));
        System.out.println("gapful: " + trueProperties.contains("gapful"));
        System.out.println("spy: " + trueProperties.contains("spy"));
        System.out.println();
    }
    void printPropertiesInOneLine() {
        System.out.printf("%d is ", number);
        Iterator<String> it = trueProperties.iterator();
        while (it.hasNext()) {
            String p = it.next();
            if (p != null && it.hasNext())
                System.out.print(p + ", ");
            else if (p != null && !it.hasNext())
                System.out.println(p);
        }
    }
}
