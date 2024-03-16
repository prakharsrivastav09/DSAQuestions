public class SelectionSort {
    public static void SelectionSort(int[] arr){

        int n = arr.length;

        //this loop for iteration

        for (int i = 0; i<n-1; i++){

            int min_index = i;
            //this loop is for pass
            for(int j = i+1; j<n; j++){

                if(arr[j] < arr[min_index])

                    min_index =j;
            }
            //Swapping
            int temp = arr[min_index];

            arr[min_index] = arr[i];

            arr[i] = temp;
        }
    }
    public static void main(String[] args) {

        int []arr = {72,50,10,44,8,20};

        SelectionSort(arr);

        for(int i =0; i< arr.length; i++){

            System.out.print(arr[i] + " ");

        }
        
    }
}