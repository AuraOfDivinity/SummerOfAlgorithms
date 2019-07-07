package com.Asel;

public class Question4 {
    public static void main(String[] args) {
        int[] myArr = {1,12, 15, 18, 2, 9, 34, 21};
        System.out.println(findMaximum(myArr));
    }

    public static int findMaximum(int[] array){
        int currentMax = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > currentMax){
                currentMax = array[i];
            }
        }
        return currentMax;
    }
}
