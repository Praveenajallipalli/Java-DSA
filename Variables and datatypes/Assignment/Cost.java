package Assignment;

import java.util.Scanner;

public class Cost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pen=sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float sum=pen+pencil+eraser;
        float gst=(0.18f*sum);
        System.out.println(sum+gst);
        int $=24;
        System.out.println($);
        sc.close();
    }
}
