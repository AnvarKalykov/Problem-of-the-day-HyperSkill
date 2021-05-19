//Write a program that reads a string and then output another string with doubled characters.

import java.util.Scanner;

public class DoubleCharacters {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] parts = inputString.split("");
        for (String part: parts) {
            System.out.print(part + part);
        }
    }
}