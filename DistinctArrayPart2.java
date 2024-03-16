public class DistinctArrayPart2 {
    static int DistinctArray(int[] array , int size){
        int count =0;
        //Delay your desion as much as you can
        for(int i =0; i<size; i++){
            int flag =0;
            for(int j =i+1; j<size; j++){
                if (array[i]==array[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag==0)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array = {1, 7, 4, 3, 4, 8, 7};
        int size = array.length;
        System.out.println(DistinctArray(array,size));

    }
}