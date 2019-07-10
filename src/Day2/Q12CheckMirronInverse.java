package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Q12CheckMirronInverse {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);

        int n = scn.nextInt();
        int[] inputArr =  new int[n];
        scn.nextLine();

        for(int i = 0; i < n; i++){
            inputArr[i] = scn.nextInt();
        }

        int [] inverseArr = getInverseArray(inputArr);

        System.out.println(isMirrorInverse(inputArr, inverseArr));
    }


    private static int[] getInverseArray(int[] original){
        int[] inverseArr = new int[original.length];

        for(int i = 0; i < original.length; i++){
            inverseArr[original[i] - 1] = i + 1;
        }

        return inverseArr;
    }

    private static boolean isMirrorInverse(int[] original, int[] inverse){
        if (Arrays.equals(original, inverse)) {
            return  true;
        }
        return false;
    }

}
