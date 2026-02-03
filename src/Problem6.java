import java.io.PrintStream;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        out.print("Enter an integer: ");
        int n = in.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum*=i;
        }
        out.printf("Factorial %d%n", sum);
        in.close();
    }
}