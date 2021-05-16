//A password is hard to crack if it contains at least A uppercase letters, at least B lowercase letters,
//        at least C digits and consists of exactly N symbols. Also, a password cannot contain two or more of the same
//        characters in a row.
//
//        For the given numbers A, B, C, and N, you should output a password that matches these requirements.
//
//        It is guaranteed that A, B, C, and N are non-negative integers, and A + B + C <= N.
//        Keep in mind that any parameter can be equal to zero. It means that it's ok if the password doesn't
//        contain symbols of such type.


import java.util.Scanner;

public class GeneratingPasswords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "";
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < a; i++) {
            password += "AB".charAt(i % 2);
        }

        for (int i = 0; i < b; i++) {
            password += "ab".charAt(i % 2);
        }

        for (int i = 0; i < c; i++) {
            password += "12".charAt(i % 2);
        }

        while (password.length() < n) {
            password += "AB".charAt(password.length() % 2);
        }

        System.out.println(password);
    }
}

