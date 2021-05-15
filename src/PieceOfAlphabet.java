import java.util.Scanner;

public class PieceOfAlphabet{
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String alphabet = "abcdefghijklmopqrstuvwxyz";
        String inputString = scanner.nextLine();
        System.out.println(alphabet.contains(inputString));

    }
}