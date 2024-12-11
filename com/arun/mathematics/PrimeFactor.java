package com.arun.mathematics;

public class PrimeFactor {
    public static void main(String[] args) {
        primeFactorOptimized(315);
    }

    public static void primeFactor(int n){
        int val = 2;
        while(n!=1){
            if(n%val==0){
                n/=val;
                System.out.print(val+" ");
            }
            else{
                val++;
            }
        }
    }

    public static void primeFactorOptimized(int n){
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
        }
        if(n>1) System.out.print(n);
    }
}
