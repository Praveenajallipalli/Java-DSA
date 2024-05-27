package Patterns;

import java.util.Scanner;

public class InvertedStar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // for (int line=1; line<=n; line++) {
        //     for (int star=1; star<=(n-line+1); star++){
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }

        int line=1;
        while(line<=n){
            int star=1;
            while(star<=(n-line+1)) {
                System.out.print('*');
                star++;
            }
            System.out.println();
            line++;
        }
        sc.close();
    }
}
