public class charAtMethod {
    public static void printLetters(String name){
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String name = "Shradha Khapra";
        printLetters(name);
    }
}
