import java.util.Scanner;

public class Print1To10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=1;
        while (num<=10) {
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
        sc.close();
    }
}