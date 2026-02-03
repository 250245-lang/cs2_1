import java.io.PrintStream;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        int n = (int) (Math.random()*50 +1);
        out.println("Guess the number!");
        while(true){
            int guess = in.nextInt();
            if(guess<n){
                out.println("Too low.");
            } else if (guess>n) {
                out.println("Too high.");
            }else{
                out.println("Correct!");
                break;
            }
        }
        in.close();
    }
}