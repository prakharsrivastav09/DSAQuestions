public class QuickSort {
    public static int partition(int arr[] , int low, int high){
        int swapindex = low-1;
        int pivot = arr[high];
        for (int j =low; j<high; j++){

            if (arr[j]<pivot){

                swapindex++;

                int temp = arr[j];
                arr[j] = arr[swapindex];
                arr[swapindex] = temp;
            }
        }

        int temp = arr[swapindex+1];
        arr[swapindex+1] = arr[high];
        arr[high] = temp ;
        return swapindex+1;
    }

    public static void quicksort(int [] arr, int low, int high) {
        if (low < high) {
            int IndexPi = partition(arr, low, high);
            quicksort(arr, low, IndexPi - 1);
            quicksort(arr, IndexPi + 1, high);
        }
    }
    public static void main(String[] args) {

        int arr[] = {70,90,10,30,50,20,60};
        int n = arr.length;
        quicksort(arr,0, n-1);
        for (int i =0; i<n; i++)
            System.out.print(arr[i] + " ");
        
    }
}