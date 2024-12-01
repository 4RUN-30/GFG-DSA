package com.arun.mathematics;

public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.println(absoluteValue(-34));
    }

    public static int absoluteValue(int num){
        if(num<0) return -1*num;
        return num;
    }
}
