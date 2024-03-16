//package com.prakhar;
//
import java.util.Scanner;

//public class Main{
//    public static void main(String[] args) {
//        System.out.println("Please enter a age");
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if(age>18) {
//            System.out.println("You're adult enjoy baby");
//        }
//        else {
//            System.out.println("Fuck you're not adult yet");
//        }
//
//    }
//}
public class NumberInWord
{
    public static void printNumberInWord (int num)
    {
        switch (num)
        {
            case 0:
                System.out.println ("ZERO");
                break;
            case 1:
                System.out.println ("ONE");
                break;
            case 2:
                System.out.println ("TWO");
                break;
            case 3:
                System.out.println ("THREE");
                break;
            case 4:
                System.out.println ("FOUR");
                break;
            case 5:
                System.out.println ("FIVE");
                break;
            case 6:
                System.out.println ("SIX");
                break;
            case 7:
                System.out.println ("SEVEN");
                break;
            case 8:
                Sysetm.out.println ("EIGHT");
                break;
            case 9:
                System.out.println ("NINE");
                break;
            default:
                System.out.println ("OTHER");
                break;
        }
    }
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt ();
        printNumberInWord (num);
    }
}