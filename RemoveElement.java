public class RemoveElement {
    public static int[] Removeelement(int[] nums , int val){
        int j =0;
        int size = nums.length;
        for(int i =0; i< nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,3,4,6,7};
    }
}