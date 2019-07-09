package Day2;

//With the use of binary search we are able to reduce the time complexity of the number search of
//the previous example from O(n) to O(log n).

public class Q3OptimizedFindNumberInArray {
    public static void main(String[] args) {
        int[] myArr = {1, 18, 23, 4 ,90, 32, 21, 18};

        System.out.println(binarySearch(myArr, 0, myArr.length -1, 4));
        // l = left end of the array
        // r =  right end of the array
        // x = item to be searched
    }

    //Binary search implemented using recusrion
    private static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }
}
