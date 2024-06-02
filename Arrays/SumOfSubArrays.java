package Arrays;

public class SumOfSubArrays {
    public static void sumOfSubArrays(int numbers[]){
        int currSum=0;
        int minSum=Integer.MAX_VALUE;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=numbers[k];
                }
                System.out.print(currSum+" ");
                if(minSum>currSum){
                    minSum=currSum;
                }
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
            System.out.println();
        }
        System.out.println("minimum sum is "+minSum);
        System.out.println("maximum sum is "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 200};
        int numbers2[] = {1, -2, 6, -1, 3};
        sumOfSubArrays(numbers);
        sumOfSubArrays(numbers2);
    }
}
