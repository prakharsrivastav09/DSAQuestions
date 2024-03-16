class LeaderInArray {
    void LeaderInArray(int[]arr, int size){

        for(int i = 0; i<size; i++){

            int j;

            for( j = i+1; j<size; j++) {

                if (arr[i] <= arr[j])

                    break;
            }
                if (j==size)
                    System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        LeaderInArray lead = new LeaderInArray();
        int [] arr = new int[]{16,17,4,3,5,2};
        int n = arr.length;
        lead.LeaderInArray(arr,n);
    }
}