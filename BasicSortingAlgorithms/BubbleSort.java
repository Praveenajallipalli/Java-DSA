package BasicSortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int numbers[]){
        int n = numbers.length;
        int swaps=0;
        for(int turns=0;turns<n-1;turns++){
            for(int j=0;j<n-1-turns;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                    swaps++;
                }
            }
            if(swaps==0){
                System.out.println("out of for loop");
                break;
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {5, 4, 1, 3, 2};
        bubbleSort(numbers);
        printArray(numbers);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        printArray(arr);
        sc.close();
    }
}
