package Assignment;

import java.util.Scanner;

public class SumOfNum {
    public static int sumNum(int n){
        int sum=0;
        while(n>0){
            int LD =n%10;
            sum+=LD;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumNum(n));
        sc.close();
    }
}
