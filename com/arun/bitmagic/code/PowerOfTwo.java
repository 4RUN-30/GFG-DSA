package com.arun.bitmagic.code;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(18));
    }

    public static boolean isPowerOfTwo(int num){
        return (num&(num-1))==0;
    }
}
