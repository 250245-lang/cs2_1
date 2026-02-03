import java.io.PrintStream;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        out.print("Enter an integer: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+= i*i;
        }
        out.printf("Sum = %d%n", sum);
        in.close();
    }
}