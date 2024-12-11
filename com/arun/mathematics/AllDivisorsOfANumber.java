package com.arun.mathematics;

public class AllDivisorsOfANumber {
    public static void main(String[] args) {
        allDivisorsOfANumber(25);
    }

    public static void allDivisorsOfANumber(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                if(i!=n/i){
                    System.out.println(n/i);
                }
            }
        }
    }
}
