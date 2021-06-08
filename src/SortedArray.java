import java.util.Scanner;

class SortedArray {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        boolean sortedTF = true;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] > array[i + 1]) {
                sortedTF = false;
                break;
            }
        }
        System.out.println(sortedTF);
    }
}