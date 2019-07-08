package com.Asel;

import java.util.Stack;

public class Question6 {
    public static void main(String[] args) {
        System.out.println(checkPalindromeUsingStack("Anna"));
    }



    public static boolean checkPalindromeUsingStack(String str) {
        boolean isPalindrome = false;
        String stringToCheck = str.toLowerCase();
        String palindromeString = "";

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < stringToCheck.length(); i++) {
            char character = stringToCheck.charAt(i);
            stack.push(character);
        }

        while (!stack.isEmpty()) {
            palindromeString = palindromeString + stack.pop();
        }

        if (stringToCheck.equals(palindromeString)) {
            isPalindrome = true;
        }

        return isPalindrome;
    }
}
