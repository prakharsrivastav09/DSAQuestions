import java.util.Scanner;

public class SqrtAndCbrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number");

        int x = sc.nextInt();
        
        System.out.println(" The sqaure root of " + x + " is " + sqrt(x));

        System.out.println("Please enter your number");

        int y = sc.nextInt();

        System.out.println(" The cube root of " + y + " is " + cbrt(y));
    }
    public static double sqrt(int x ){

        double sq = Math.sqrt(x);

        return sq;
    }
     static double cbrt(int y){

        double cq = Math.cbrt(y);

        return cq;
    }
}