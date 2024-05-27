import java.util.Scanner;

public class WhileLoop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int counter=0;
        while (counter<100) {
            System.out.println("Hello World!");
            counter++;
        }
        System.out.println("Printed HW 100x");
        sc.close();

    }
}