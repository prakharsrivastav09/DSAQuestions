public class Sorting {
    public static void main(String[] args) {
        int array[] = {5, 3, 1, 9, 8, 2, 4, 7};
        System.out.println(" Array before bubble sort ");
        //Function calling
        display(array);

        bubbleSort(array);

        System.out.println("Array after bubble sort");
        display(array);
    }

    static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            System.out.println();
        }
    }

    static void bubbleSort(int[] array) {
        //This loop is for pass in bubble sort
        for (int i = 0; i < array.length - 1; i++) {
            //This loop is use for iteration
            for (int j = 0; j < array.length - i - 1; j++) {
                //For swapping
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }
    }
    }

//public static void insertionSort(int[] array){
//
//    for(int i =1; i< array.length; i++){
//
//        int temp = array[i];
//
//        int j = i-1;
//
//        //Use for sorting
//        while(j>=0 && array[j]>temp){
//            //This is use for steps
//            array[j+1] = array[j];
//
//            j = j-1;
//        }
//        //This is use for for last digit
//        array[j+1] = temp;
//    }
//}
// public static void main(String[] args){
//
//    int[] array = {8,6,4,20,24,2,10,12};
//
//    insertionSort(array);
//
//    for(int i = 0; i< array.length; i++){
//
//        System.out.println(array[i] + " ");
//    }
//}
//}