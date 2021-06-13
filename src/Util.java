/*
Correct the code so it doesn't throw an exception.
 */

class Util {
    // correct this method to avoid NPE
    public static void printLength(String name) {
        try {
            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}