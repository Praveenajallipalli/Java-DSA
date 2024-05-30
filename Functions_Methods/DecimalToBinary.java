import java.util.Scanner;

public class DecimalToBinary {
    public static int decToBin(int decNum){
        int pow=0;
        int binNum=0;
        while(decNum>0){
            int rem=decNum%2;
            binNum=binNum+(int)(rem*Math.pow(10, pow));
            pow++;
            decNum=decNum/2;
        }
        return binNum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decNum=sc.nextInt();
        System.out.println(decToBin(decNum));
        sc.close();
    }
}
