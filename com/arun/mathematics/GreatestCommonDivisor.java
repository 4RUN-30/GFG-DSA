package com.arun.mathematics;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcdOne(7,13));
    }

    public static int gcdOne(int a,int b){
        int min = Math.min(a,b);

        while (min>=1) {
            if (a % min == 0 && b % min == 0) {
                return min;
            }
            min--;
        }
        return -1;
    }
}
