public class Problem1{
    public static void main(String[] args){
        int total = 0;
        for (String arg : args) {
            total += Integer.parseInt(arg);
        }
        System.out.println("Total: "+String.valueOf(total));
    }
}