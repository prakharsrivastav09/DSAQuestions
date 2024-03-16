import java.util.Arrays;

class Rearrange {
    public static void rearrange(int[]arr , int n){
        int j =0 , k =n-1;
        int key = arr[n-1]+1;
        for(int i =0; i<n; i++){
            
            if(i%2==0){
                
                arr[i] = (arr[k] % key) * key + arr[i];
                
                k--;
                
            } else {
                
                arr[i] = (arr[j] % key) * key + arr[i];
                
                j++;
            }
        }
        for (int i =0; i<n; i++){
             arr[i] /= key;
       }
    }
    public static void main(String[] args) {

        int arr[] = new int[] {1,2,3,4,5,6};

        rearrange(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }
}