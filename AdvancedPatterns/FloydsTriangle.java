package AdvancedPatterns;

import java.util.Scanner;

public class FloydsTriangle {
    public static void floyds_triangle (int n) {
        int cnt = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(cnt+" ");
                cnt++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        floyds_triangle(n);
        sc.close();
    }
}
