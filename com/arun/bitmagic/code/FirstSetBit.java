package com.arun.bitmagic.code;

public class FirstSetBit {
    public static void main(String[] args) {
        System.out.println(getFirstSetBit(18));
    }
    public static int getFirstSetBit(int n){

        int count = 0;
        while(n>0){
            count++;
            if((n&1)==1){
                return count;
            }
            n = n>>1;
        }
        return count;
    }
}
