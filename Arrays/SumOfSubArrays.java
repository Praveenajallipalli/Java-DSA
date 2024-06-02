package Arrays;

public class SumOfSubArrays {
    public static void sumOfSubArrays(int numbers[]){
        int minSum=numbers[0];
        int maxSum=numbers[0];
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=numbers[k];
                }
                System.out.print(sum+" ");
                if(minSum>sum){
                    minSum=sum;
                }
                if(maxSum<sum){
                    maxSum=sum;
                }
            }
            System.out.println();
        }
        System.out.println("minimum sum is "+minSum);
        System.out.println("maximum sum is "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 200};
        sumOfSubArrays(numbers);
    }
}
