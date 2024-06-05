package Assignment;

import java.util.Scanner;

public class Q1 {
    public static int countOfVowels(String str){
        int cnt=0;
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countOfVowels(str));
        sc.close();
    }
}
