import java.io.PrintStream;
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        out.print("Enter an integer: ");
        int n = in.nextInt();
        double pi = 1;
        for (int i = 1; i <= n; i++) {
            double s = 1 / ((double) i * 2 + 1);
            if(i%2 == 0){
                pi+=s;
            }else {
                pi-=s;
            }
        }
        out.printf("Pi: %f%n", pi*4);
        in.close();
    }
}