package Day2;

public class Q4ReverseArray {
    public static void main(String[] args) {
        int [] myArr = {1, 9 , 12, 4, 3, 8};

        int[] reversedArr = reverseArray(myArr);
        for(int i:reversedArr){
            System.out.print(i+ ",");
        }
    }

    private static int[] reverseArray(int[] arr){
        int[] swappedArr = new int[arr.length];

        int j = arr.length - 1;
        for(int i = 0; i < arr.length; i++){
            if(i >= arr.length /2){
                break;
            }
            swappedArr = swapElements(arr, i, j);
            j--;
        }
        return swappedArr;
    }

    private static int[] swapElements(int[] arr, int i, int j){
        int holder = 0;
        holder = arr[i];
        arr[i] = arr[j];
        arr[j] = holder;

        return arr;
    }
}
