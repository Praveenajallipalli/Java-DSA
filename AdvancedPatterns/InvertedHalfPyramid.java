package AdvancedPatterns;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void invertedHalfPyramid(int n){
        // for (int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i+j >= n+1) {
        //             System.out.print('*'+" ");
        //         }else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Another method
        for (int i=1; i<=n; i++) {
            //spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            //stars
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        invertedHalfPyramid(n);
        sc.close();
    }
    
}