package AdvancedPatterns;

import java.util.Scanner;

public class HalfPyramidWithNumbers {
    public static void halfPyramid (int n){
        // for (int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i+j <= n+1) {
        //             System.out.print(j+" ");
        //         }else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Another method
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        halfPyramid(n);
        sc.close();
    }
}
