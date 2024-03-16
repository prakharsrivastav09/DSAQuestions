public class scratch_52 {
    public static void main(String[] args) {
//        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
//        for (int i=0; i<myArray.length; i++){
//            System.out.println("My element is :" + myArray[i]);
        int[] myArray = new int[10];
        for (int i=0; i<myArray.length; i++){
            myArray[i] = i*5;
           System.out.println("My element is :" + myArray[i]);
        }

    }
}