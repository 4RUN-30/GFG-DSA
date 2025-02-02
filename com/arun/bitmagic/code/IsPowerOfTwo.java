package com.arun.bitmagic.code;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
    static boolean isPowerOfTwo(int num){
        if(num == 0) return false;
        return (num & (num-1)) == 0;
    }
}
