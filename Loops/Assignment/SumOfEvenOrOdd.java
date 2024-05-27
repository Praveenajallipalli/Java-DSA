package Assignment;

import java.util.Scanner;

public class SumOfEvenOrOdd {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int EvenSum=0;
         int OddSum=0;

         for(int i=0;i<n;i++) {
            int num=sc.nextInt();
            if(num%2==0) {
                EvenSum+=num;
            }else {
                OddSum+=num;
            }
         }
         
         System.out.println("Even numbers sum: " + EvenSum);
         System.out.println("Odd numbers sum: " + OddSum);
         sc.close();
    }
}
