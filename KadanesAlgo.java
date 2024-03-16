public class KadanesAlgo {
    public static int SumSubArray(int[] arr){

        int maxsum = 0;

        int currsum = 0;

        for(int i =0; i< arr.length; i++){

            currsum = currsum +arr[i];

            if (currsum>maxsum){
                maxsum = currsum;
            }
            if (currsum<0){
                currsum = 0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,-2,5};

        System.out.println("Here the sum is: " + SumSubArray(arr));
    }
}