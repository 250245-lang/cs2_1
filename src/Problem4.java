import java.io.PrintStream;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;

        out.print("Enter your weight in kg: ");
        double weight = in.nextDouble();
        out.print("Enter your height in meters: ");
        double height = in.nextDouble();
        double bmi = weight / (height*height);
        out.printf("BMI: %.2f%n", bmi);
        if(bmi>=30){
            out.println("Obese");
        } else if(bmi>=25){
            out.println("Overweight");
        } else if(bmi>=18.5){
            out.println("Normal weight");
        } else {
            out.println("Underweight");
        }
        in.close();
    }
}