// package Functions_Methods;

public class CallByValueAndReference {
    public static void swap(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("a value = " + a);
        System.out.println("b value = " + b);
    }
    public static void main(String[] args) {
        int a=10;
        int b=50;
        swap(a,b);
        System.out.println("a value = " + a);
        System.out.println("b value = " + b);
        
    }
}
