package com.arun.mathematics;

public class Power {
    public static void main(String[] args) {
        System.out.println(powerOptimizedIterative(2,3));
    }

    public static long power(long base,long power){
        long result = 1L;
        while(power-->0){
            result*=base;
        }
        return result;
    }

    public static long powerOptimized(long base,long power){
        if(power == 0) return 1;
        long temp = powerOptimized(base,power/2);
        if(power%2==0){
            return temp * temp;
        }
        else{
            return temp * temp * base;
        }
    }

    public static long powerOptimizedIterative(long base,long power){
        long res = 1L;
        while(power!=0){
            if(power%2!=0){
                res = res * base;
            }
            base *= base;
            power/=2;
        }
        return res;
    }
}
