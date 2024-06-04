public class DiagonalSum{
    public static void diagonalSum(int matrix[][]){
        int n=matrix.length;
        int sum=0;

        // Brute force method
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         else if(i+j==n-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        // System.out.println(sum); 

        for(int i=0;i<n;i++){
            //pd
            sum+=matrix[i][i];
            if(i!=n-1-i)
                sum+=matrix[i][n-1-i];
        }
        System.out.println("Diagonal sum is : "+sum);
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                         {5, 6, 7, 8}, 
                         {9, 10, 11, 12}, 
                         {13, 14, 15, 16}};
        diagonalSum(matrix);
    }
}