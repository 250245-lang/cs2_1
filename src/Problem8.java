import java.io.PrintStream;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        out.print("Enter an integer: ");
        int n = in.nextInt();
        int reverse = 0;
        while (n>0){
            reverse*=10;
            reverse+= n%10;
            n = n/10;
        }
        out.printf("Reverse: %d%n", reverse);
        in.close();
    }
}