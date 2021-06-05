/*
A right rotation is an operation that shifts each element of an array to the right. For example,
if an array is {1,2,3,4,5} and we right rotate it by 1, the new array will be {5,1,2,3,4}.
If we rotate it by 2, the new array will be {4,5,1,2,3}. It goes like this: {1,2,3,4,5} -> {5,1,2,3,4} -> {4,5,1,2,3}.

Write a program that performs a right rotation on an array by a given number.

Input format:
The first line is an array of numbers.
The second line is the number of rotations.

Output format:
Resulting array
 */


import java.util.Arrays;
import java.util.Scanner;

public class RightRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        String[] newArr = new String[arr.length];
        int shift = sc.nextInt() % arr.length;
        System.arraycopy(arr, arr.length - shift, newArr, 0, shift);
        System.arraycopy(arr, 0, newArr, shift, arr.length - shift);
        String result = Arrays.toString(newArr).replaceAll("\\[|,|]", "");
        System.out.println(result);

    }
}

