package dev.practice.one;

public class XOR {
    public static void main(String[] args) {
        int a = 15;
        int b = 27;
        // 15b=> 0000 1111
        // 27b=> 0001 1011
        //       0001 0100
        //       16+4 = 20
        // binary XOR Operator (^)
        int xor = a^b;
        System.out.println("xor ^ :" + xor);
    }
}
