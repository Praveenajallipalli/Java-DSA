package Arrays;

public class KadanesAlgorithm {
    public static boolean isAllElemNeg(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>=0){
                return false;
            }
        }
        return true;
    }
    public static void kadanesMaxSum(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        if(isAllElemNeg(numbers)){
            for(int i=0;i<numbers.length;i++){
                ms=Math.max(numbers[i], ms);
            }
            System.out.println("max subarray sum is : "+ms);
        }else{
            for(int i=0;i<numbers.length;i++){
                cs = cs+numbers[i];
                if(cs<0){
                    cs=0;
                }
                ms=Math.max(cs,ms);
            }
            System.out.println("max subarray sum is : "+ms);
        }
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        int numbers2[] ={-2, -3, 4, -1, -2, 1, 5, -3};
        int numbers3[] = {-9, -6, -5, -88};
        kadanesMaxSum(numbers);
        kadanesMaxSum(numbers2);
        kadanesMaxSum(numbers3);
    }
}
