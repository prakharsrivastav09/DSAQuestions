public class SortArray {
    public static void insertion(int[] array){
        
        int j = 0;
        
        for(int i =1; i< array.length; i++){
            
            int temp = array[i];
            
            array[j] = i-1;
            
            while(array[j]>0 && array[j+1]>temp){
                
                j = j-1;
            }
            
            array[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        
        int array[] = {2,5,6,8,10,22,33,91};
        
        for(int i =0; i < array.length; i++){
            
            System.out.print(array[i] + " ");
        }
        
    }
}