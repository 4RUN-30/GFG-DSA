package com.arun.bitmagic.code;

public class KthBitSetOrNot {
    public static void main(String[] args) {
        System.out.println(kthBitSetOrNot(43,3));
    }
    static boolean kthBitSetOrNot(int num,int k){
        int temp = num;
        temp = temp >> (k-1);
        System.out.println(temp);
        if((temp & 1) == 1 ){
            return true;
        }
        return false;
    }
}
