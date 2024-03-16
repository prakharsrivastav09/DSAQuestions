import java.util.Scanner;

public class Array {
    
    public static int[] getUserarray(int number) {

        System.out.println(" Please " + number + " integer ");

        Scanner sc = new Scanner(System.in);

        int[] Uservalues = new int[number];

        for (int i = 0; i < Uservalues.length; i++) {

            Uservalues[i] = sc.nextInt();
        }
        return Uservalues;
    }
    public static void main(String[] args){

        int[] UserArray = getUserarray(6);

        for (int i =0; i< UserArray.length; i++){

            System.out.println(UserArray[i]);
        }
    }
}

