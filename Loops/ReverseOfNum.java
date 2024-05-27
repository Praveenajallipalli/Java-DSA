import java.util.Scanner;

public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n;

        // reverse a number
        int rev=0;
        while (n1>0) {
            int lastDigit=n1%10;
            n1=n1/10;
            rev=lastDigit+rev*10;
        }
        System.out.println("Reverse of a number: "+rev);

        //print the reverse of a number
        System.out.print("Reverse of a number: ");
        for(int n2=n;n2>0;n2/=10){
            int lastDigit=n2%10;
            System.out.print(lastDigit);
        }
        System.out.println();
        sc.close();
    }
}
