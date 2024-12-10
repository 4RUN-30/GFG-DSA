package com.arun.mathematics;

public class GCD {
    public static void main(String[] args) {
        System.out.println(euclidGcdOptimised(16,28));
    }

    //O(n)
    public static int gcd(int a,int b){
        int min = Math.min(a,b);

        while(min>=1){
            if(a%min == 0 && b%min==0){
                return min;
            }
            min--;
        }
        return 1;
    }


    public static int euclidGcd(int a,int b){
       while (a!=b){
            if(a>b){
                a = a-b;
            }
            else{
                b = b-a;
            }
       }
       return a;
    }

    public static int euclidGcdOptimised(int a,int b){
        if (b!=0){
            return euclidGcdOptimised(b,a%b);
        }
        return a;
    }
}
