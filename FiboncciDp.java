import java.util.Scanner;

public class FiboncciDp {
    public static int Fibonacci(int n , int[] qb){
        if(n==0 || n==1){
            return n;
        }
        if (qb[n] != 0){
            return qb[n];
        }
        int fib1 = Fibonacci(n-1, qb);
        int fib2 = Fibonacci(n-2, qb);
        int fibn = fib1+fib2;

        qb[n] = fibn;
        return fibn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] qb = new int[n+1];
       int Fibonacci =  Fibonacci(n , qb);
        System.out.println(Fibonacci);
        sc.close();
        
    }
}