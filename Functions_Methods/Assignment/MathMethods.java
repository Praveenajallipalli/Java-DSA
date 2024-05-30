package Assignment;

import java.util.Scanner;

public class MathMethods {
    public static void mathMethods(int a, int  b){
        System.out.println(Math.min(a,b));
        System.out.println(Math.max(a,b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.sqrt(b));
        System.out.println(Math.pow(a,b));
        // System.out.println(Math.avg(a,b));  there is no avg method in math
        System.out.println(Math.abs(b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        mathMethods(a,b);
        sc.close();
    }
}
