import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class AverageBigDecimal {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        BigDecimal a = scanner.nextBigDecimal();
        BigDecimal b = scanner.nextBigDecimal();
        BigDecimal c = scanner.nextBigDecimal();
        BigDecimal three = BigDecimal.valueOf(3);

        BigDecimal result = a.add(b).add(c).divide(three, 0, RoundingMode.DOWN);


        System.out.println(result.setScale(0, RoundingMode.DOWN));
    }
}
