import java.util.Scanner;

public class FuncOverloading {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    // function overloading does not depend on return type
    // public static float sum(int a, int b){
    //     return a+b;
    // }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,9));
        sc.close();
    }
}
