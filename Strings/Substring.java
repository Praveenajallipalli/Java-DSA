import java.util.*;

public class Substring {
    public static void substring(String str, int si, int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        System.out.println("substring : "+substr);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    substring(str, 2, 5);
    System.out.println(str.substring(2,5));
    sc.close();

    }
}
