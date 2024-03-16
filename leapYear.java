import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (year%4==0 || year%100!=0 || year%400==0){
            System.out.println("Specified year is a leap year");
        } else{
            System.out.println("Specified year is a not leap year");
        }
        
    }
}