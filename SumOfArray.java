import javax.sound.midi.Soundbank;
import java.util.Scanner;


public class SumOfArray {
    private static Scanner sc = new Scanner(System.in);
    public static int[] getUserArray(int number) {

        System.out.println(" Enter " + number + " integer ");

        int[] UserValues = new int[number];

        for (int i = 0; i < UserValues.length; i++) {

            UserValues[i] = sc.nextInt();
        }

       return UserValues;
    }

    public static void main(String[] args) {

        int[] UserArray = getUserArray(6);

//        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < UserArray.length; i++) {

            sum += UserArray[i];

        }

        System.out.println("The sum is : " + sum);
    }
}
