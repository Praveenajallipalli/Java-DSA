package Arrays;

public class LinearSearch {

    //Time complexity for linear search is O(n)
    
    public static int linear_search(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;
        System.out.println(linear_search(numbers, key));
    }
}
