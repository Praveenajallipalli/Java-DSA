import java.util.Scanner;

public class BinaryToDecimal {
    public static int binToDec(int binNum){
        int decNum=0;
        int power=0;
        while(binNum>0){
            int LD = binNum%10;
            decNum = decNum + (int)(LD*Math.pow(2, power));
            binNum = binNum/10;
            power++;
        }
        return decNum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int binNum=sc.nextInt();
        System.out.println("Decimal number of " + binNum + " = " + binToDec(binNum));
        sc.close();
    }
}
