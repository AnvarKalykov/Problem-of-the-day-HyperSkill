//The cinema has n rows, each row consists of m seats (n and m do not exceed 20).
//        A two-dimensional matrix stores the information on the sold tickets:
//        the number 1 means that the ticket for this place is already sold,
//        and the number 0 means that the place is available. You want to buy k tickets to neighboring seats in the same row.
//        Find whether it can be done.
//
//        Input data format
//
//        On the input, the program gets the number of n rows and m seats. Then, there are n lines,
//        each containing m numbers (0 or 1) separated by spaces. The last line contains the number k.
//
//        Output data format
//
//        The program should output the number of the row with k consecutive available seats.
//        If there are several rows with k available seats, output the first row with these seats.
//        If there is no such a row, output the number 0.
//


import java.util.Scanner;

public class Cinema  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        int count0 = 0;
        int availability = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int seats = scanner.nextInt();

        if (seats == 1) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == 0) {
                        availability = i + 1;
                        break;
                    }
                }
                if (availability != 0) {
                    break;
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == 0) {
                        count0++;
                    }
                }
                if (count0 >= seats) {
                    if (checkAlternate(arr[i], seats)) {
                        availability = i + 1;
                        break;
                    } else  {
                        count0 = 0;
                    }
                } else {
                    count0 = 0;
                }
            }
        }
        System.out.println(availability);
    }

    public static boolean checkAlternate(int[] row, int seats) {
        int count = 0;
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 0) {
                count++;
                if (count == seats) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
}
