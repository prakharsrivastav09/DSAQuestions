import java.util.Scanner;

public class scratch_59 {
    public static boolean hasNotEqual(int num1, int num2, int num3){
        if (num1 * num2 == num3){
            return true;
        } else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        boolean res = hasNotEqual (num1, num2, num3);
        System.out.println(res);


        
    }
}