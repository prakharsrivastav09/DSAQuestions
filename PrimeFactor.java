public class PrimeFactor {
    public static void primefactor(int num){
        //First divide with 2's n
        while (num % 2 == 0){
            
            System.out.println(2 + " ");
            
            num = num/2;
        }
        //Divide by all odd numbers
        for(int i =3; i<Math.sqrt(num); i+=2){
            
            while (num%i==0){
                
                System.out.println(i);
                
                num = num/i;
            }
        }
        //if we encounter any number which is greater than 2
        if (num >2)
            
            System.out.println(num);

    }
    public static void main(String[] args) {

        int num = 1716;
        
        primefactor(num);
    }
}