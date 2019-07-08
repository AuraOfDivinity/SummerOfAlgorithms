package com.Asel;

public class Question2 {
    public static void main(String[] args) {
        int [] array = {42, 3, 1 , 12 , 42};

        checkFortyTwos(array);

    }

    public static void checkFortyTwos(int[] array){
        int count = 0;

        for(int i:array){
            if(i == 42){
                count++;
            }
        }

        System.out.println(count);
    }
}
