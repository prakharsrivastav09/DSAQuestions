public class Ques2 {
//    public static int findMax(int [] arr , int n){
//        if(n==0){
//            return arr[0];
//        } else{
//            return Math.max(arr[n-1], findMax(arr , n - 1));
//        }
//    }
//    public static void main(String[] args) {
//
//        int [] arr = { 2,3,4,1,5,9};
//
//        int n = arr.length;
//
//        System.out.println(findMax(arr , n ));
//    }
    public static int findmin(int[] arr , int n){
        if(n==1){
            return arr[0];
        } else {
            return Math.min(arr[n-1], findmin(arr, n-1)  );
        }
    }
    public static void main(String[] args){
        int[] arr = {2,4,5,6,1};
        int n = arr.length;
        System.out.println(findmin(arr , n));
    }
}