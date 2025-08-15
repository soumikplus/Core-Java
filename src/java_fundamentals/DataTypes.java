package java_fundamentals;

public class DataTypes {
    public static void main(String[] args) {
        boolean flag = true;
        // byte for -128 to 127 (8-bit signed two complements integer)
        byte range = -128;
        // short has values from -32768 to 32767 (16-bit signed two's complement integer)
        // The int data type can have values from -231 to 231-1 (32-bit signed two's complement integer)
        // The long data type can have values from -263 to 263-1 (64-bit signed two's complement integer).
        // The double data type is a double-precision 64-bit floating-point.
        double num1 = -42.5;
        // The float data type is a single-precision 32-bit floating-point
        float num2= -42.3f;
        char letter1 = '\u0051';
        char letter2 = 65;

        System.out.println(flag);
        System.out.println(range);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(letter1);
        System.out.println(letter2);
    }

}
