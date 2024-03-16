public class isPrime {
    public static void main(String[] args) {
        int n = 50;
        isPrime(n);

    }
    public static void isPrime(int n ){
        int count = 0;
        for (int i = 1; i<= n; i++){
            for (int j = 2; j<=n; j++){
                if(n%j==0){
                    count++;
                }
            }
            if (count==0){
                System.out.println("The element is prime number : " + i);
            }
            else{
                System.out.println("The element is not a prime number : " + i);
            }

        }
    }
}