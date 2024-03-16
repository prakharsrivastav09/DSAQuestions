import java.util.Arrays;

public class RevrseArrayImp {
    public static void reverseArray(int[] arr, int k){


        for(int i =0;i< arr.length;i=i+k){

            int start = i;

            int end = Math.min(i+k-1 , arr.length-1);

            while (start<=end){

                int temp = arr[start];

                arr[start] = arr[end];

                arr[end] = temp;

                start++;

                end--;
            }
        }
    }
    public static void main(String[] args) {

        int [] arr = {1,5,6,7,3,2,9,4,8};

        int k =2;

        reverseArray(arr,k);

        for (int i =0; i< arr.length; i++){


            System.out.print(Arrays.toString(arr));
        }

        
    }
}