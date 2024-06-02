package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int numbers[]){
        // int n=numbers.length;
        // for(int i=0; i<n/2;i++){
        //     int temp = numbers[i];
        //     numbers[i]=numbers[n-i-1];
        //     numbers[n-i-1]=temp;
        // }

        int first=0,last=numbers.length-1;
        while(first<last){
            int temp = numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int numbers[] = new int[n];
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        reverseArray(numbers);
        for(int i=0;i<n;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
