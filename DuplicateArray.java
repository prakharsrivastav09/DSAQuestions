public class DuplicateArray {
    public static int duplicateArray(int [] arr, int size){
        int ans= arr[0];

        for(int i = 1; i< size;i++){

            ans = ans^arr[i];
        }
        for (int i = 2; i<size;i++){

            ans = ans ^ i;
        }

        return ans;


    }
    public static void main(String[] args) {

        
    }
}