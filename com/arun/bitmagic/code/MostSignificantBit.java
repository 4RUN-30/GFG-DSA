package com.arun.bitmagic.code;

public class MostSignificantBit {
    public static void main(String[] args) {
        System.out.println(mostSignificantBit(18));
    }

    public static int mostSignificantBit(int num){
        int res = 0;

        if(num == 0) return res;

        while (num>1){
            num = num >> 1;
            res++;
        }
        return res+1;
    }
}
