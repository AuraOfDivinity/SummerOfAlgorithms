package Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q7ArrayIntersections {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 1, 2, 4, 1};
        int [] arr2 = {2, 1, 3, 1, 5, 2, 2};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> intList1 = new ArrayList<Integer>();
        List<Integer> intList2 = new ArrayList<Integer>();
        List<Integer> intersectionList = new ArrayList<Integer>();

        for (int i : arr1)
        {
            intList1.add(i);
        }

        for (int i : arr2)
        {
            intList2.add(i);
        }

        for(int i: intList1){
            if(intList2.contains(i)){
                intList2.remove(intList2.indexOf(i));
                intersectionList.add(i);
            }
        }

        for(int i: intersectionList){
            System.out.print(i+" ");
        }

    }

}
