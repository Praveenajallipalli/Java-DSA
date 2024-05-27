import java.util.Scanner;

public class ContinueProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        do{
            System.out.print("Enter your number: ");
            int number=sc.nextInt();
            if(number%10==0){
                continue;
            }
            System.out.println("Number was: " + number);
        } while(true);
        
    }
}
