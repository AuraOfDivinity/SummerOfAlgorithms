package Day2;

public class Q10SumOfArrays {
    public static void main(String[] args) {
        int [] arr1 = {1, 0 ,2 ,9};
        int [] arr2 = {3, 4 , 5, 6, 7};

        int len1 = arr1.length;
        int len2  = arr2.length;

        int[]revArr1 = reverseArray(arr1, len1);
        int[]revArr2 = reverseArray(arr2, len2);

        int [] largeArr, smallArr;

        if(len1 > len2){
            largeArr = revArr1;
            smallArr = revArr2;
        }
        else{
            largeArr = revArr2;
            smallArr = revArr1;
        }

        int[] output = reverseArray(sumArr(largeArr, smallArr), len1 +1);

        for(int i = 0; i < output.length; i ++){
            System.out.print(output[i]);
        }

    }


    private static int[] reverseArray(int[] a, int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        return b;
    }


    private static int[] sumArr(int[] largeArr, int[] smallArr){
        int carry = 0;
        int sum = 0;
        int[] output=  new int[largeArr.length + 1];

        for(int i = 0; i < largeArr.length; i++){
            if(i > smallArr.length - 1){
                if(largeArr[i] + carry > 10){
                    output[i] = 0;
                    carry = 1;
                }
                else{
                    output[i] = largeArr[i];
                    carry = 0;
                }
            }
            else{
                if(largeArr[i] + smallArr[i] + carry > 10){
                    output[i] = (largeArr[i] +smallArr[i] + carry) % 10;
                    carry = 1;
                }
                else{
                    output[i] = largeArr[i] + smallArr[i] + carry;
                    carry = 0;
                }
            }
        }

        return output;

    }



}
