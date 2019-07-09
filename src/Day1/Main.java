package Day1;
import java.util.Scanner;

public class Main {
    static Scanner scn =  new Scanner(System.in);

    public static void main(String[] args) {
        int [] retArr = takeArrayInput(4);
    }

    public static int[] takeArrayInput(int n){
        int[] inputArray = new int[n];
        for(int i = 0; i <n; i++){
            inputArray[i] = scn.nextInt();
        }
        return inputArray;
    }
}
