import java.util.*;
public class TypeConversion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        
        int a=25;
        long b=a;
        System.out.println(b); // possible because b(destination type)>a(source type)

        // long p=25;
        // int q=p;
        // System.out.println(q); // gives error because destination type< source type

        sc.close();
    }
}