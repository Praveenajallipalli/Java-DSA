package BasicSortingAlgorithms.Assignment;

public class Selection {
    public static void selectionDesc(int arr[]){
        for(int i=0;i<arr.length;i++){
            int maxPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[maxPos]){
                    maxPos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxPos];
            arr[maxPos]=temp;
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
        selectionDesc(numbers);
        printArray(numbers);
    }
}
