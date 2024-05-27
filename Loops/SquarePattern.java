import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        //using for 
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }

        //using while
        int i=1,j=1;
        while(i<=n){
            while(j<=n){
                System.out.print("*"+" ");
                j++;
            }
            System.out.println();
            i++;
            j=1;
        }
        sc.close();
    }
}
