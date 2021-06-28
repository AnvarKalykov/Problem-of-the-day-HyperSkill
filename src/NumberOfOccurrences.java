import java.util.Scanner;

/*
Write a program that finds the frequency of occurrences of a substring in a given string. Substrings cannot overlap: for example, the string ababa contains only one substring aba.


Input data format

The first input line contains a string, the second one contains a substring.


Sample Input 1:

ababa
aba
Sample Output 1:

1
Sample Input 2:

hello there
the
Sample Output 2:

1
Sample Input 3:

hello yellow jello
ll
Sample Output 3:

3


 */

public class NumberOfOccurrences{
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        int count = firstLine.length() - firstLine.replaceAll(secondLine, "").length();
        System.out.println(count / secondLine.length());
    }
}
