package dev.practice.one;


public class ClearAllBits {
    public static void main(String[] args) {
        /*
        * num  =  0011 0110
        * &
        * mask =  1111 0000     (1111 1111 << i)
        * -----------------
        * result  0011 0000
        * (-1 << i) & num
        * */
        System.out.println(Integer.toBinaryString(6));
    }
}
