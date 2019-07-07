package com.Asel;

public class Question3 {
    public static void main(String[] args) {
        int [] myArr = {1, 2, 4, 3};

        boolean out = checkSorted(myArr);
        System.out.println(out);
    }

    public static boolean checkSorted(int[] array){
        boolean isSorted = true;
        for(int i = 0; i < array.length; i++){
            if(i != array.length - 1){
                if(array[i] > array[i+1]){
                    isSorted = false;
                    break;
                }
            }
        }

        return isSorted;
    }
}
