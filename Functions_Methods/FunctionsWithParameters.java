// package Functions_Methods;

import java.util.Scanner;

public class FunctionsWithParameters {
    public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum=calculateSum(a,b);
        System.out.println("sum is: " + sum);
        sc.close();
    }

    // public static void main(String[] args)
    // {
    //     System.out.println(10 / 0);
    //     fun();
    // }
    // public static void fun()
    // {
       
    //     moreFun();
    //     System.out.println("Method fun");
    // }
    // public static void moreFun()
    // {
        
    //     System.out.println("Method moreFun");
    // }
}
