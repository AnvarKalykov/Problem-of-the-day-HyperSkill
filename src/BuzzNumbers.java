import java.util.Scanner;

public class BuzzNumbers {
    public static void main(String[] args) {
//        write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int someNumber = scanner.nextInt();
        if (someNumber > 0 && someNumber % 2 != 0 && someNumber % 7 != 0 && someNumber % 10 != 7) {
            System.out.println("This number is Odd.");
            System.out.println("It is not a Buzz number.");
            System.out.println("Explanation:");
            System.out.printf("%d is neither divisible by 7 nor it ends with 7.",someNumber);
        } else if (someNumber > 0 && someNumber % 2 == 0 && someNumber % 7 == 0 && someNumber % 10 != 7) {
            System.out.println("This number is Even.");
            System.out.println("It is a Buzz number.");
            System.out.println("Explanation:");
            System.out.printf("%d is divisible by 7.",someNumber);
        } else if (someNumber > 0 && someNumber % 2 != 0 && someNumber % 7 != 0 && someNumber % 10 == 7) {
            System.out.println("This number is Odd.");
            System.out.println("It is a Buzz number.");
            System.out.println("Explanation:");
            System.out.printf("%d is ends with 7.", someNumber);
        } else if (someNumber > 0 && someNumber % 2 != 0 && someNumber % 7 == 0 && someNumber % 10 == 7) {
            System.out.println("This number is Odd");
            System.out.println("It is a Buzz number.");
            System.out.println("Explanation:");
            System.out.printf("%d is divisible by 7 and it ends with 7.", someNumber);
        } else if (someNumber >= 0 && someNumber % 2 == 0 && someNumber % 7 != 0 && someNumber % 10 != 7){
            System.out.println("This number is Even.");
            System.out.println("It is not a Buzz number.");
            System.out.println("Explanation:");
            System.out.printf("%d is neither divisible by 7 nor it ends with 7.", someNumber);

        } else if (someNumber > 0 && someNumber % 2 != 0 && someNumber % 7 == 0 && someNumber % 10 != 7) {
            System.out.println("This number is Odd.");
            System.out.println("It is a Buzz number.");
            System.out.println("Explanation:");
            System.out.printf("%d is divisible by 7.",someNumber);
        } else {
            System.out.println("This number is not natural!");
        }

    }
}

