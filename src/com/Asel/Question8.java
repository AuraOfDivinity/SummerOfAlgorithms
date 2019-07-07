package com.Asel;

public class Question8 {

    public static void main(String[] args) {
        System.out.println(addNumbersAsString("1234","16"));
    }

    public static String addNumbersAsString(String num1, String num2){
        int tot = Integer.parseInt(num1) +Integer.parseInt(num2);

        return String.valueOf(tot);
    }
}
