package Arrays;

public class MaxSumSubarrayPrefix {
    public static void printMaxSum(int numbers[]){
        int currSum=0;
        // int minSum=Integer.MAX_VALUE;
        int maxSum=Integer.MIN_VALUE;

        //prefix array
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }

        //max sum finding
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){

                currSum = i==0?prefix[j]:prefix[j]-prefix[i-1];

                System.out.print(currSum+" ");

                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
            System.out.println();
        }
   
        System.out.println("maximum sum is "+maxSum);
    }
    
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        int numbers2[] = {1, -2, 6, -1, 3};
        printMaxSum(numbers);
        printMaxSum(numbers2);
    }
}
