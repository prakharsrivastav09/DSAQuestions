import java.util.Scanner;

public class scratch_60 {
    public static int AverageOfNumbers(int num1 , int num2 , int num3){

        int Average = num1 + num2 + num3 / 3;
        return Average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        AverageOfNumbers(num1 , num2 , num3);
        
    }
}