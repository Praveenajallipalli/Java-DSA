package Arrays;

import java.util.Scanner;

public class CreatingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int marks[] = new int[50];
        int numbers[] = {1,2,3};
        float moreNumbers[] = {4.1f,5.9f,6.3f};
        String fruits[] = {"apple", "mango", "orange"};
        System.out.println(numbers);
        System.out.println(moreNumbers);
        System.out.println(fruits);
        System.out.println(marks);
    }
}
