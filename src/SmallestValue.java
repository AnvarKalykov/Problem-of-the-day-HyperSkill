import java.math.BigInteger;
import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        BigInteger input = new Scanner(System.in).nextBigInteger();
        BigInteger result = BigInteger.ONE;
        int i = 1;

        while (result.compareTo(input) < 0) {
            result = result.multiply(BigInteger.valueOf(++i));
        }
        System.out.println(i);

    }
}
