import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // String str = "abcd";
        // String str2 = new String("xyz");
        // System.out.println(str);
        // System.out.println(str2);

        String name = sc.next(); //takes a word
        String empty = sc.nextLine();
        String name2 = sc.nextLine(); // takes full line

        System.out.println(name);
        System.out.println(empty);
        System.out.println(name2);

        String str = "Tony Stark";
        int length = str.length();
        System.out.println(length);
        sc.close();
    }
}
