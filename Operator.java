import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int b = sc.nextInt();

        switch (num) {
            case 0:
//
                    System.out.println(num*b);
                    break;

            case 1:
                    System.out.println(num + b);
                    break;
            case 2:
                    System.out.println(num / b);
                    break;
            case 3:
//
                    System.out.println(num - b);
                     break;
           case 4:
                    System.out.println(num % b);
                    break;
        }

    }

}