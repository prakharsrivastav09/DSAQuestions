import java.util.Arrays;

public class kthvalue {
    public static void main(String[] args) {

        int arr[] = {6,5,9,7,4,2};

        int size = arr.length;

        int k = 4;
        Arrays.sort(arr);
        //Traverse the array
        int i;
        for (i = 0; i < size; i++) {
            //move the index
            // whenever you encountered the duplicates
            while (i < size - 1 && arr[i] == arr[i + 1])
                i++;
            //Coming here it means new element encountered
            k--;

            if (k == 0)
                break;
        }
        System.out.println(arr[i]);
    }
}