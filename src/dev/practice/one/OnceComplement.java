package dev.practice.one;

public class OnceComplement {
    public static void main(String[] args) {
        int a = 15;
        int b = 27;
        // 15b=> 0000 1111
        // 27b=> 0001 1011

        // ~X = (-X)-1 = -15-1 = -16
        // (-) 0001 0000
        // binary One Complement Operator (~)
        int onceComplement = ~a;
        System.out.println("onceComplement ~ :" + onceComplement);
    }
}
