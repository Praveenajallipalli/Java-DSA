public class Compare {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if(s1==s2){ // gives true, points to same string
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }

        if(s1==s3){  //checks at object level, gives false
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }

        if (s1.equals(s3)) { //checks only value and gives true
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
    }
}

// strings are equal
// strings are not equal
// strings are equal
