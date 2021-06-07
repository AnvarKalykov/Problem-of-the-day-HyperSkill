import java.util.Scanner;


public class NumbersDivisibleBySix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int max = 0;
        int nextNumber = 0;

        for (int i = 0; i < number; i++) {
            nextNumber = scanner.nextInt();
            if (nextNumber % 6 == 0) {
                max = max + nextNumber;
            }
        }
        System.out.println(max);
    }
}