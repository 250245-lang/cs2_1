import java.io.PrintStream;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        out.print("Enter score: ");
        int n = in.nextInt();
        if(n<0 || n>100){
            out.println("Invalid score");
        } else if(n>=90){
            out.println("Grade: A");
        } else if(n>=80){
            out.println("Grade: B");
        } else if(n>=70){
            out.println("Grade: C");
        } else if(n>=60){
            out.println("Grade: D");
        } else {
            out.println("Grade: F");
        }
        in.close();
    }
}