/*
Write a program that reads a string and checks whether it is a palindrome, i.e. it reads the same both left-to-right and right-to-left.

The program must output “yes” if the string is a palindrome and “no” otherwise.
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String isPalindrome = "yes";
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != charArray[(charArray.length - 1) - i]) {
                isPalindrome = "no";
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
