package dev.practice.one;

public class LeftShift {
    public static void main(String[] args) {
        int a = 15;
        // 15 => 0000 1111
        //       0011 1100
        // 32+16+8+4 = 60
        int leftShifted = a << 2;
        System.out.println("left shift 2: " + leftShifted);

        System.out.println();
        System.out.println(2 << 1); //  4
        System.out.println(2 << 2); //  8
        System.out.println(2 << 3); //  16
        System.out.println(2 << 4); //  32
        System.out.println(2 << 5); // 64

        System.out.println(Integer.toBinaryString(1 << 1));
    }
}
