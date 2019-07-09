package Day2;

public class Q2FindNumberInArray {
    public static void main(String[] args) {
        int [] myArr = {1, 8 ,9 , 12};
        System.out.println(findNumberInArray(8, myArr));
    }

    public static int findNumberInArray(int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
