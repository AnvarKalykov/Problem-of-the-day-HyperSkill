import java.util.Scanner;

public class StringSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine();
        int one1 = scanner.nextInt();
        int two = scanner.nextInt();

        System.out.println(one.substring(one1, two + 1));

    }

}
