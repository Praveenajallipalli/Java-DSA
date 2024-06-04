package BasicSortingAlgorithms;

import java.util.*;

public class InbuiltSort {
    public static void printArray(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {5, 3, 4, 1, 6, 2};
        // Arrays.sort(arr);
        // printArray(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        // reverseOrder() always take objects as parameters, so it will not take int[] as parameter,
        // for that we use Integer object.
        printArray(arr);
        // Arrays.sort(arr,0,3);
        // printArray(arr);
        // Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        // printArray(arr);
    }
}
