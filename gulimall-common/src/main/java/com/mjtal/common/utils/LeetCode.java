package com.mjtal.common.utils;

public class LeetCode {

    public static void main(String[] args) {
        int[] dig = new int[1];
        dig[0] = 9;
        int[] ints = plusOne(dig);
        System.out.println(ints[1]);
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len - 1; i >= 0;i--){
            if(digits[i]+1==10){
                digits[i] = 0;
            }else {
                digits[i] = digits[i]+1;
                return digits;
            }
        }
        int[] newdig = new int[len+1];
        newdig[0] = 1;
        return newdig;
    }
}
