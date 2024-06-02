package Arrays;

import java.util.Scanner;

public class ArraysAsArguments {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] ={96,97,98,99};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        sc.close();
    }
}
