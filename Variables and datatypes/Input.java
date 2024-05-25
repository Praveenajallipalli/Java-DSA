import java.util.*;
public class Input{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int num = sc.nextInt();
        sc.nextLine();
        String Name=sc.nextLine();
        float price=sc.nextFloat();
        boolean bool = sc.nextBoolean();

        System.out.println(name);
        System.out.println(num);
        System.out.println(Name);
        System.out.println(bool);
        System.out.println(price);
        
        sc.close();
    }
}