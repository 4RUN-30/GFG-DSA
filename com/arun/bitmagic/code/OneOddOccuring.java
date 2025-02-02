package com.arun.bitmagic.code;

public class OneOddOccuring {
    public static void main(String[] args) {
        System.out.println(oneOddOccuring(new int[]{1,1,2,3,4,5,2,4,5}));
    }
    public static int oneOddOccuring(int[] nums){
        int res = 0;
        for(int num : nums)
            res = res ^ num;
        return res;
    }

}
