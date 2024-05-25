import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        String rc=(marks>=33)?"PASS":"FAIL";
        System.out.println("report card: "+rc);
        sc.close();
    }
}
