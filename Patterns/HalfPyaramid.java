package Patterns;

import java.util.Scanner;

public class HalfPyaramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        // int line=1;
        // while(line<=n){
        //     int num=1;
        //     while(num<=line){
        //         System.out.print(num);
        //         num++;
        //     }
        //     line++;
        //     System.out.println();
        // }

        for(int line=1;line<=n;line++){
            for(int num=1;num<=line;num++){
                System.out.print(num);
            }
            System.out.println();
        }

        sc.close();
    }
}
