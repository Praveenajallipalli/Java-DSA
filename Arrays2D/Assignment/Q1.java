package Assignment;

public class Q1 {
    public static int findCountOf7(int matrix[][],int key){
        int cnt=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==key){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},{8,8,7}};
        System.out.println("Count of 7 in matrix is : "+findCountOf7(matrix, 7));
    }
}
