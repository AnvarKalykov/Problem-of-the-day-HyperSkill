import java.io.IOException;

public class ThrowExcep {

    // change this method
    public static void method() throws IOException {
        throw new IOException("device error");
    }

    /* Do not change code below */
    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}
