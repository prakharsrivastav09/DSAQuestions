import java.util.Scanner;

public class Palindrome {
    public static boolean palindromeNo(int number){
        int rev = 0; int temp = number;
        while (temp!=number){
            rev = rev*10+temp%10;
            temp = temp/10;
        }
        if(number == rev){
           return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (palindromeNo(number)){
            System.out.println(number + " Is a palindrome number ");
        } else{
            System.out.println(number + " Is not a palindrome number ");
        }
        
    }
}