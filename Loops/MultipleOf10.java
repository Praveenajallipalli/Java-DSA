import java.util.Scanner;

public class MultipleOf10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // while(true){
        //     System.out.println(n);
        //     n=sc.nextInt();
        //     if(n%10==0){
        //         break;
        //     }
        // }
        // System.out.println("Exited");

        do{
            System.out.println("Enter your number: ");
            int num=sc.nextInt();
            if(num%10==0){
                break;
            }
            System.out.println(num);
        } while (true);
        sc.close();
    }
}
