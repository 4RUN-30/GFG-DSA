package com.arun.bitmagic.code;

public class BinaryRepresentationOfNegativeNumbers {
    public static void main(String[] args) {
        int res = binaryRepresentationOfNegativeNumbers(10);
        System.out.println(res);
    }
    static int binaryRepresentationOfNegativeNumbers(int num) {
        // STEP 1 Invert all the bits
        num = ~num;
        return num + 1;
    }
}
