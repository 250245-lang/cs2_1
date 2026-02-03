import java.io.PrintStream;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        out.print("Enter an integer: ");
        int n = in.nextInt();
        int sum = 0;
        while (n>0){
            n = n/10;
            sum++;
        }
        out.printf("Number of digits %d%n", sum);
        in.close();
    }
}