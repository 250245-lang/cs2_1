public class Problem2 {
    public static void main(String[] args){
        double r = ((Math.random() * 9 + 1));
        double circumference = 2* Math.PI * r;
        double area = Math.PI * r * r;
        System.out.printf("Radius: %.2f%nCircumference: %.2f%nArea: %.2f%n", r, circumference, area);
    }
}
