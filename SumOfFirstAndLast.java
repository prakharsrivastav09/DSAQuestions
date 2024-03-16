public class SumOfFirstAndLast {
    //    public static int  SumFirstandLast(int num){
//        int first = 0 , Last = num%10;
//        num = num/10;
//        while (num!=0){
//            if(num/10==0)
//                 first = num%10;
//                 num =  num/10;
//        }
//        return first + Last;
//    }
    public static void main(String[] args) {
        int num = 1345;
        int rem =0;
        int sum =0;
        do{
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        while (num!=0);
        System.out.println("The sum is : " + sum);
//        System.out.println(SumFirstandLast(234));
//        System.out.println(SumFirstandLast(890));
//        System.out.println(SumFirstandLast(000));
//    }
    }
}