package Assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int factorial=1;
        for(int i=2;i<=number;i++) {
            factorial*=i;
        }
        System.out.println("Factorial of number: " + factorial);
        sc.close();
    }
}
