package com.arun.mathematics;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrimeOptimized(35));
    }

    public static boolean isPrime(int num){
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeOptimized(int num){
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
