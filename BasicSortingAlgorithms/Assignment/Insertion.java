package BasicSortingAlgorithms.Assignment;

public class Insertion {
    public static void insertionDesc(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
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
        insertionDesc(numbers);
        printArray(numbers);
    }
}
