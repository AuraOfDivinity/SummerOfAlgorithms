package com.Asel;

public class Question6 {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("hello"));
    }

    public static boolean checkPalindrome(String str){
        boolean isPalindrome = false;

        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();

        if(reversed.equals(str)){
            isPalindrome = true;
        }

        return isPalindrome;
    }
}
