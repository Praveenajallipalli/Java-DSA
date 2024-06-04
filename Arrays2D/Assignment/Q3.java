package Assignment;

import java.util.Scanner;

public class Q3 {
    public static void transpose(int matrix[][],int newMtrx[][]){
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         newMtrx[j][i]=matrix[i][j];
        //     }
        // }

        //both code is working
        for(int i=0;i<newMtrx.length;i++){
            for(int j=0;j<newMtrx[0].length;j++){
                newMtrx[i][j]=matrix[j][i];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int matrix[][] = { {1,4,9},{11,4,3},{2,2,3} };

        // int n = matrix.length;
        // int m = matrix[0].length;

        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int newMtrx[][] = new int[m][n];
        transpose(matrix, newMtrx);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(newMtrx[i][j]+" ");
            }
            System.out.println();
        }
    }
}
