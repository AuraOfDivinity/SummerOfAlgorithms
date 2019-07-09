package Day1;

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        int[] myArr = {3, 5, 7, 19, 1, 2};
        System.out.println(sumOfSmallNumber(myArr));
    }

    public static int sumOfSmallNumber (int[] array){
        Arrays.sort(array);
        int sumOfSmallNumbers = array[0] +array[1];
        return sumOfSmallNumbers;
    }
}
