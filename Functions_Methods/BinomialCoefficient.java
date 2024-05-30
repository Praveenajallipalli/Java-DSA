import java.util.Scanner;

public class BinomialCoefficient {
    public static int fact(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int binomialCoeff(int n,int r){
        return fact(n)/(fact(r)*fact(n-r));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(binomialCoeff(n,r));
        sc.close();
    }    
}
