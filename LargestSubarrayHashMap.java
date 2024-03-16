import java.util.HashMap;

class LargestSubarrayHashMap {
    static int MaxLeng(int[] arr){
        //// Creates an empty hashMap hM
        HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();
        int sum =0;
        int max =0;
        // Traverse through the given array
        for (int i =0; i< arr.length; i++){
            // Add current element to sum
            sum+=arr[i];

            if(sum==0)
                max = i+1;
            // Look this sum in hash table

            Integer prev = hm.get(sum);
            // Look this sum in hash table
            if (prev!=null)
                max = Math.max(max, i-prev);
            else
                hm.put(sum,i);
        }
        return max;
    }
    public static void main(String[] args) {

        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };

        // Function call
        System.out.println(
                "Length of the longest 0 sum subarray is "
                        + MaxLeng(arr));
        
    }
}