import java.util.Scanner;

public class SymmetricalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        char ch1 = num.charAt(0);
        char ch2 = num.charAt(1);
        char ch3 = num.charAt(2);
        char ch4 = num.charAt(3);

        if(ch1 == ch4 && ch2 == ch3) {
            System.out.println(1);
        } else {
            System.out.println((int) (Math.random() + 2));
        }
    }
}