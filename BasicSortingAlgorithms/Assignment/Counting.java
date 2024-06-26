package BasicSortingAlgorithms.Assignment;

public class Counting {
    public static void countingDesc(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(arr[i],largest);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=arr.length-1;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j--;
                count[i]--;
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
        int numbers[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        countingDesc(numbers);
        printArray(numbers);
    }
}
