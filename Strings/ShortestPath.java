public class ShortestPath {
    public static float getShortestPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='W'){
                x--;
            }
            else if(str.charAt(i)=='N'){
                y++;
            }else{
                y--;
            }
        }
        float ans = (float)(Math.sqrt(x*x+y*y));
        return ans;

    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println("Shortest path is : "+getShortestPath(str));
    }
}
