import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0) {
            System.out.println("Number "+a+" is even");
        }else {
            System.out.println("Number "+a+" is odd");
        }
        sc.close();
    }
}
