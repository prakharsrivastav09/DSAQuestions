public class GreatestCommonDivisor {
    public static int GCD(int num1 ,int num2){
        int greatest = 0;
        if(num1 > 10 && num2 > 10){

            for(int i=1; ((i <= num1) &&( i <= num2)); i++)

                if ((num1 % i == 0) && (num2 % i == 0))
                    greatest = i;

        }
        return greatest;
    }
    public static void main(String[] args) {

        System.out.println(GCD(25,15));
        
        System.out.println(GCD(12,30));
    }
}