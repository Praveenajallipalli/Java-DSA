package Arrays;

public class LargestNum {
    public static int getLargest(int numbers[]){
        int Largest=-Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        
        // Time complexity is O(n)

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>Largest){
                Largest = numbers[i];
            }
            if(numbers[i]<Smallest){
                Smallest = numbers[i];
            }
        }
        System.out.println("Smallest num in array: "+Smallest);
        return Largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 3, 6, 2, 5};
        System.out.println("Largest num in array: "+getLargest(numbers));
    }
}
