public class StockOfSpan {
    static void stockspan(int []arr, int size)
    {
        for(int i=0 ; i< size; i++) {
            int curr_span =1;
            for (int j = i-1; j>=0 && arr[j] <= arr[i]; j--){
                curr_span ++;
                System.out.println(curr_span);}
        }
    }    public static void main(String[] args) {
        int [] arr={12,14,15,7,16,17,5,12,10,18,20};
        int size= arr.length;
                stockspan(arr,size);
    }
}