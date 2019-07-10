package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Q8NumberPairs {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int target = scn.nextInt();

        int [] myArr = {3, 1, 9, 7 , 5 , -1};

        outputPairs(target, myArr);
    }




    private static void outputPairs(int target, int[] myArr){
        Arrays.sort(myArr);

        outer:
        for(int i = 0; i < myArr.length; i++){
            for(int j = i + 1; j < myArr.length; j++){
                if(myArr[i] + myArr[j] == target){
                    System.out.println(myArr[i] + "," +myArr[j]);
                }
                else if(myArr[i]+ myArr[j] > target){
                    break;
                }

            }
        }
    }
}
