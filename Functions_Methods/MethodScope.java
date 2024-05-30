public class MethodScope {
    public static void methodScope(){
        // System.out.println(sum);  gives error as sum is declared after
        int sum=0;
        System.out.println(sum);
        if(true){
            int var=5;
            System.out.println(var);
        }
        // System.out.println(var); gives error
    }
    public static void main(String[] args) {
        methodScope();
    }
}
