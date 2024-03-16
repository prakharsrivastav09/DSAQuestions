import java.util.Arrays;

public class DistinctArraypart3 {
    static int DistintArray(int[] array, int size){
        Arrays.sort(array);
        int count=0;
        //Traverse the array
        for(int i =0; i<size; i++){
            while (i<size-1 && array[i]==array[i+1])
                i++;

               count++;

        }
        return count;
    }
    public static void main(String[] args) {
        int[] array ={5,3,5,6,8};
        int size = array.length;
        System.out.println(DistintArray(array,size));
    }
}