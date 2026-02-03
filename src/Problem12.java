import java.io.PrintStream;
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        out.print("Enter a year to check if it's a leap year: ");
        int n = in.nextInt();
        if(n%400 == 0 || (n%4 == 0 && n%100!=0)){
            out.println("A leap year!");
        }else{
            out.println("Not a leap year.");
        }
        in.close();
    }
}