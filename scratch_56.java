import java.util.Scanner;

public class scratch_56 {
    public static void megabytes(Double kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid number");
        } else {
            Double megabytes = (kilobytes / 1000);
            Double kiloremainder = (kilobytes % 1024);
            System.out.println(" The converted megabyte is : " + megabytes + " Kiloremainder is : " + kiloremainder);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double kilobyte = sc.nextDouble();
        megabytes(kilobyte);

        
    }
}