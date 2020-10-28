package dev.practice.one;

public class OR {
    public static void main(String[] args) {
        int a = 15;
        int b = 27;
        // 15b=> 0000 1111
        // 27b=> 0001 1011
        //       0001 1111
        //          16+8+4+2+1 = 31
        // binary OR Operator (|)
        int or = a|b;
        System.out.println("OR: " + or);
    }
}
