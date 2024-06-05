public class printLargest {
    public static void largestSubStr(String fruits[]){
        String l = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(l.compareTo(fruits[i]) < 0){
                l=fruits[i];
            }
        }
        System.out.println(l);
    }
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};
        largestSubStr(fruits);
    }
}
