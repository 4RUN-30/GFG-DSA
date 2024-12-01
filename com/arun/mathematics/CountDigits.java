package com.arun.mathematics;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(9235));
    }

    public static int countDigits(int num){
        int noOfDigits = 0;
        while(num>0){
            noOfDigits++;
            num/=10;
        }
        return noOfDigits;
    }
}
