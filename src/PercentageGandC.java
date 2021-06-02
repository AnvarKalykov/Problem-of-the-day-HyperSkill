import java.util.Scanner;

public class PercentageGandC {
    public static void main(String[] args) {
        //put your code here
        Scanner input = new Scanner(System.in);
        String str = input.next().toLowerCase();

        double counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                counter++;
            } else if (str.charAt(i) == 'c') {
                counter++;
            }
        }
        double gcPercent = counter / str.length() * 100;
        System.out.println(gcPercent);
    }
}
