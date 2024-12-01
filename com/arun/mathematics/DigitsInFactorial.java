package com.arun.mathematics;

public class DigitsInFactorial {
    public static void main(String[] args) {
        System.out.println(digitsInFactorial(5));
    }

    public static int digitsInFactorial(int n){
        if (n == 0 || n == 1) {
            return 1; // 0! = 1! = 1, which has 1 digit
        }

        // Sum of logarithms
        double logSum = 0;
        for (int i = 2; i <= n; i++) {
            logSum += Math.log10(i);
        }

        // Number of digits is floor(logSum) + 1
        return (int) Math.floor(logSum) + 1;
    }
}
