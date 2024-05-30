package Assignment;

import java.util.Scanner;

public class Even {
    public static boolean evenOrNot(int n){
        if (n%2==0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(evenOrNot(a));
        sc.close();
    }
}
