public class FindingFrequency {
    static void countfrequency(int [] arr, int size){
        for(int i =0; i<size; i++){

            int flag = 0;
            int count = 0;
            //counting of any element has to be delayed to its lassts occurence
            for(int j = i+1; j<size;j++){
                if(arr[i]==arr[j]){
                    flag =1;
                    break;
                }

            }
            //The continue keyword is used to end the current iteration
            if(flag==1)
                continue;

            for(int j =0; j<=size; j++){
                if (arr[i]==arr[j])
                    count++;
            }
            System.out.println(arr[i]+ ":" + count);

        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,6,3,6};
        int size = arr.length;
        countfrequency(arr,size);
    }
}