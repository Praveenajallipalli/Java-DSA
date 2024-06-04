package BasicSortingAlgorithms.Assignment;

public class Bubble {
    public static void bubbleDesc(int arr[]){
        for(int turns=0;turns<arr.length;turns++){
            for(int j=0;j<arr.length-1-turns;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
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
        bubbleDesc(numbers);
        printArray(numbers);
    }
}
