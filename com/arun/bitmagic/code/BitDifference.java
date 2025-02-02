package com.arun.bitmagic.code;

public class BitDifference {
    public static void main(String[] args) {
        System.out.println(bitDifference(10,20));
    }
    static int bitDifference(int a,int b){
        int res = 0;

        int c = a^b;

        while(c!=0){
            res++;
            c = (c & (c-1));
        }

        return res;
    }
}
