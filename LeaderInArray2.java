public class LeaderInArray2 {
    void LeaderInArray(int[] arr, int size){

        int max_from_right = arr[size-1];

        System.out.println(max_from_right + " ");

        for(int i = size-2; i>=0; i--){

            if(max_from_right < arr[i]){

                max_from_right = arr[i];

                System.out.println(max_from_right + " ");
            }
        }
    }
    public static void main(String[] args) {

        LeaderInArray2 lead = new LeaderInArray2();

        int [] arr = new int[] {16,17,4,3,5,2};

        int n = arr.length;

        lead.LeaderInArray(arr,n);
    }
}