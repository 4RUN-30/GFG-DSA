package com.arun.mathematics;

import java.util.ArrayList;

public class QuadraticEquationRoots {
    public static void main(String[] args) {
        System.out.println(quadraticEquationRoots(1,-7,12));
    }

    public static ArrayList<Integer> quadraticEquationRoots(int a,int b,int c){
            int root = b * b - 4 * a * c;
            ArrayList<Integer> result = new ArrayList<>();
            if(root < 0) {
                result.add(-1);
            }
            else if (root == 0){
                int value = -b / (2*a);
                result.add(value);
                result.add(value);
            }
            else{
                int value1 =(int) Math.floor(((-b + Math.sqrt(root))/(2*a)));
                int value2 = (int) Math.floor(((-b - Math.sqrt(root))/(2*a)));
                result.add(Math.max(value1,value2));
                result.add(Math.min(value1,value2));
            }
            return result;
    }
}
