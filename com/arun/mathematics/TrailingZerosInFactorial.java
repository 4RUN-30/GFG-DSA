package com.arun.mathematics;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        System.out.println(trailingZerosInFactorialTwo(25));
    }

    // O(n)
    public static int trailingZerosInFactorialOne(int num){
        long factorial = 1;
        for(int i=2;i<=num;i++){
            factorial*=i;
        }
        int noOfTrailingZeros =0;
        while(factorial%10==0 && factorial!=0){
            noOfTrailingZeros++;
            factorial/=10;
        }
        return noOfTrailingZeros;
    }


    public static int trailingZerosInFactorialTwo(int num){
        int noOfTrailingZeros =0;
        for(int i=5;i<=num;i*=5){
            noOfTrailingZeros += num/i;
        }
        return noOfTrailingZeros;
    }
}
