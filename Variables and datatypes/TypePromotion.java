public class TypePromotion {
    public static void main(String[] args) {
        char a='a';
        char b='b';
        System.out.println(b-a);
        // char c=a-b; //cannot convert from int to char
        char c='c';
        byte d=45;
        short s1=25;
        byte f= 25;
        short s2=30;
        // byte sum=d+f;  //cannot convert from int to byte
        // short sum= s1+s2;  //cannot convert from int to byte
        int sum=c+d+s1+s2+f;
        System.out.println(sum);
        byte bt=(byte)(d+s1+a);  
        System.out.println(bt);  //output: -89
        s1=(short)(32767+1);
        System.out.println(s1); //output: -32768
        
    }
}
