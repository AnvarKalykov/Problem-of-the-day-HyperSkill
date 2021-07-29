/*
Strings in Java implement java.lang.CharSequence interface. Since Java internally uses UTF-16, 2 bytes are required to store each char. At the same time, ASCII encoding allows storing character codes in one byte and includes all Latin letters, digits, and standard special characters. Compared to the standard String class, ASCII-character sequences require half the memory.

Write a class named AsciiCharSequence for storing ASCII-character sequences, that should:

implement the interface java.lang.CharSequence;
have a constructor that takes a byte array;
have methods length, charAt, subSequence, and toString.
You can find the declaration of methods and their behavior in the description of java.lang.CharSequence (JavaDoc or sources).

Carefully check signatures of abstract methods of java.lang.CharSequence interface, especially subSequence method. It accepts 2 integers: start index (inclusive) and end index (!exclusive). The method returns an object of a class that implements java.lang.CharSequence interface. For example, it can be an instance of AsciiCharSequence class.

Note: the testing system will always pass correct input parameters to overridden methods.

P.S. The feature is supported since Java 9 in standard strings. For details, see this article on compact strings in Java 9.


 */


import java.nio.charset.StandardCharsets;
import java.util.*;

class AsciiCharSequence implements CharSequence {
    private byte[] array;

    AsciiCharSequence(byte[] array) {
        this.array = array;
    }

    public byte[] getArray() {
        return array;
    }

    @Override
    public int length() {
        return getArray().length;
    }

    @Override
    public char charAt(int index) {
        String sequence = new String(getArray(), StandardCharsets.ISO_8859_1);
        return sequence.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(array, start, end));
    }

    @Override
    public String toString() {
        return new String(getArray(), StandardCharsets.ISO_8859_1);
    }

    // implementation
}