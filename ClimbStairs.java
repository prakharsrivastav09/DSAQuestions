import java.util.Scanner;

class Scratch {
    public static int countpaths(int n ){
        if (n==0) {
            return 1;
        } else if (n<0) {
            return 0;
        }
        int [] dp = new int[n+1];
        dp[0] = 1;
        for (int i =1; i<=n; i++){
            dp[i] = dp[i-1];
            if(i>=2)
                dp[i] += dp[i-2];

            if (i>=3)
                dp[i] += dp[i-3];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int paths = countpaths(n);
        System.out.println(paths);
    }
}