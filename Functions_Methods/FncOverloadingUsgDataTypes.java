
public class FncOverloadingUsgDataTypes {
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(9,7));
        System.out.println(sum(7.5f,99.78f));

    }
}
