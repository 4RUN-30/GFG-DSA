package com.arun.mathematics;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(837));
    }

    public static boolean isPalindrome(int num){
        int reverse = 0;
        int straight = num;
        while(num>0){
            reverse = reverse * 10 + num%10;
            num/=10;
        }
        return reverse == straight;
    }
}
