package dev.practice.one;

public class RightShift {
    public static void main(String[] args) {
        int a = 15;
        int b = 27;


        // 15b=> 0000 1111
        //       0011 1100
        // 32+16+8+4 = 60

        int rightShifted = a << 2;
        System.out.println("right shift 2: " + rightShifted);
    }
}
