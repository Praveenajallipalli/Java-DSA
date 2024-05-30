package Assignment;

import java.util.Scanner;

public class Palindrome {
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rem+rev*10;
            n=n/10;
        }
        return rev;
    }
    public static void isPalindrome(int n){
        if(reverse(n)==n){
            System.out.println(n + " is a palindrome");
        }else {
            System.out.println(n + " is not a palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPalindrome(n);
        sc.close();
    }
}
