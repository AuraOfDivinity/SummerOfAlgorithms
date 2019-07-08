package com.Asel;

public class Question8 {

    public static void main(String[] args) {
        System.out.println(addNumbersAsString("1623434234234", "12342394823948024"));
    }

    public static String addNumbersAsString(String num1, String num2) {

        String revNum1 = new StringBuilder(num1).reverse().toString();
        String revNum2 = new StringBuilder(num2).reverse().toString();

        String holder = "";

        if (revNum2.length() > revNum1.length()) {
            holder = revNum1;
            revNum1 = revNum2;
            revNum2 = holder;
        }

        String output = "";


        int carry = 0;
        for (int i = 0; i < revNum1.length(); i++) {
            if (i > revNum2.length() - 1) {
                int res = Character.getNumericValue(revNum1.charAt(i)) + carry;
                carry = 0;
                if (res > 9) {
                    output += "0";
                    carry = 1;
                } else {
                    output += revNum1.charAt(i);
                }
            } else {
                int res = Character.getNumericValue(revNum1.charAt(i)) + Character.getNumericValue(revNum2.charAt(i)) + carry;
                carry = 0;

                if (res > 9) {
                    carry = 1;
                    output += String.valueOf(res % 10);
                } else {
                    output += String.valueOf(res);
                }
            }
        }
        return new StringBuilder(output).reverse().toString();
    }
}
