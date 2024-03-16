public class Ques1 {
    public static void printpattern(int n){
        if(n<=0){
            return;
        }
        System.out.println(n + " ");
        printpattern(n-1);
        System.out.println(n+ " ");
        printpattern(n-1);
        System.out.println(n + " ");
    }
    public static void main(String[] args) {
        int n = 2;
        printpattern(n);
    }
}