import java.util.Arrays;
import java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] firstBox = {
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt()
        };
        int[] secondBox = {
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt()
        };

        Arrays.sort(firstBox);
        Arrays.sort(secondBox);

        if (firstBox[0] > secondBox[0]
                && firstBox[1] > secondBox[1]
                && firstBox[2] > secondBox[2]) {
            System.out.println("Box 1 > Box 2");
        } else if (firstBox[0] < secondBox[0]
                && firstBox[1] < secondBox[1]
                && firstBox[2] < secondBox[2]) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}
