public class LinearSearch {
    public static void LinearSearch(int[] arr, int item){

        for(int i = 0; i<arr.length; i++){
            if(arr[i]==item){
                System.out.println(item + " Found at index : " + i);
                return;
            }

            else {
                System.out.println("Not Found");
            }
        }
    }
    public static void main(String[] args) {
        int count =0;
        int arr[] = {1, 7, 4, 3, 4, 8, 7};
        LinearSearch(arr , count);
        
    }
}