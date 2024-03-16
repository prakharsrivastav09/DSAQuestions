import java.util.Arrays;

public class Revision {
    public static void linearSearch(int[]arr , int item){
        for(int i =0; i< arr.length; i++){

            if(arr[i]==item){
                System.out.println("Your item : " + item + " Found at index : " + i);

                return;
            }
        }
    }
    public static void main(String[] args) {

        int [] arr = {2,6,7,4,9,8};

        int size = arr.length;

        int item = 7;

        linearSearch(arr,item);


    }
}