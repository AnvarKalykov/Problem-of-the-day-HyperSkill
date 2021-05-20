//The Scanner class is widely used to parse text to strings, and it is by far the simplest way to get input in Java.
//
//        In this task, you simply need to use the method nextLine to read a whole line of input. The trick is to use the Scanner class without the import statement.
//
//        The application will receive a string from the method and output it in the corresponding format.


public class GettingInput {
    public static String getString() {
        // write your code here
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextLine();
    }
}
