import java.util.Arrays;

public class countinversion {

}
    class Test {
        static int arr[] = new int[]{2, 4, 1, 3, 5};

        static int getInvCount(int n) {
            int inv_count = 0;
            for (int i = 0; i < n - 1; i++)
                for (int j = i + 1; j < n; j++)
                    if (arr[i] > arr[j])
                        inv_count++;

            return inv_count;
        }

        // Driver method to test the above function
        public static void main(String[] args) {
            System.out.println("Number of inversions are "
                    + getInvCount(arr.length));
        }
    }