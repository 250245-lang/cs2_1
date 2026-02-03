import java.io.PrintStream;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        int n = 100;
        int heads = 0;
        for (int i = 1; i <= n; i++) {
            heads +=  (int) (Math.random()*2);
        }
        out.printf("Heads: %d%nTails: %d%n", heads, n-heads);
        in.close();
    }
}