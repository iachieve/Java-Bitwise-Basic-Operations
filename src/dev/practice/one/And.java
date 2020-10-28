package dev.practice.one;

public class And {
    public static void main(String[] args) {
        int a = 15;
        int b = 27;

        // 15b=> 0000 1111
        // 27b=> 0001 1011
        //
        // binary AND Operator (&)
        int and = a&b;
        System.out.println("AND Operator: " + and);

    }
}
