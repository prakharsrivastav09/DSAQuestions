import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        int n  = 5;
      for(int i = 0; i<=n; i++){
          for(int j = n)
          for(int j = 0; j<=n-i-1; j++){
              System.out.print("* ");
          }
          System.out.println();
      }
    }
}