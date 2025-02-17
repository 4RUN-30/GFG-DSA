package com.arun.mathematics;

public class LCM {
    public static void main(String[] args) {
        System.out.println(optimizedLcm(12,5));
    }

    //O(n)
    public static int lcm(int a,int b){
        int res = Math.max(a,b);
        while (true){
            if(res%a==0 && res%b==0){
                break;
            }
            res++;
        }
        return res;
    }

    public static int optimizedLcm(int a,int b){
        int gcd = GCD.euclidGcdOptimised(a,b);
        return (a*b)/gcd;
    }

}
