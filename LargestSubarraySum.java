public class LargestSubarraySum {
    public static int MaxLen(int [] arr , int N){
        int max = 0;

        for(int i =0; i<N; i++){

            int current =0;

            for(int j =i; j<N; j++){

                current+=arr[j];

                if(current==0)
                    max = Math.max(max, j - i + 1);
            }
        }
        return max;
    }
    public static void main(String[] args) {
       int [] arr = {15,-2,2,-8,1,7,10,23};
       int N = arr.length;
        System.out.println("Length of the longest sum" + "Subarray is " + MaxLen(arr,N));
        
    }
}