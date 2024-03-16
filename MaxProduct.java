public class MaxProduct {
    public static long MaxProduct(int[] arr , int num){
        if(num==0){
            return 0;
        }
        long res = 1;
        long max = 1;
        long min = 1;
        for(int i =0; i< num; i++){

            if(arr[i]>0){

                max *=arr[i];
                min = Math.min(arr[i]*min, 1 );
            } else if (arr[i]==0) {
                max = min = 1;
            } else {
                min += max - (max = min);
                min *= arr[i];
                max = Math.max(1 , arr[i]*max);

            }
            res = Math.max(max,res);
        }
        return res;

    }
    public static void main(String[] args) {
        int [] arr = {6,-3,-10,0,2};
        int num = arr.length;
        System.out.println(MaxProduct(arr,num));
    }
}