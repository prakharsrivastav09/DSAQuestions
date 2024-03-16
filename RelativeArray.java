import java.util.*;
class RelativeArray {
    
        static void sortA1ByA2(int A1[], int N, int A2[], int M,
                               int ans[])
        {
            HashMap<Integer, Integer> mp = new HashMap<>();

            // indexing for answer = ans array
            int ind = 0;

            // initially storing frequency of each element of A1
            // in map [ key, value ] = [ A1[i] , frequency[
            // A1[i] ] ]
            for (int i = 0; i < N; i++) {
                if (!mp.containsKey(A1[i]))
                    mp.put(A1[i] , 1);
                else
                    mp.put(A1[i], mp.get(A1[i]) +1);
            }

            // traversing each element of A2, first come first
            // serve
            for (int i = 0; i < M; i++) {

                // checking if current element of A2 is present
                // in A1 or not if not present go to next
                // iteration else store number of times it is
                // appearing in A1 in ans array

                if (mp.containsKey(A2[i])) {

                    // mp[ A2[i] ] = frequency of A2[i] element
                    // in A1 array
                    for (int j = 1; j <= mp.get(A2[i]); j++)
                        ans[ind++] = A2[i];
                }

                // to avoid duplicate storing of same element of
                // A2 in ans array
                mp.remove(A2[i]);
            }

            // store the remaining elements of A1 in sorted
            // order in ans array
            for (HashMap.Entry<Integer, Integer> it :
                    mp.entrySet()) {

                // it.second = frequency of remaining elements
                for (int j = 1; j <= it.getValue(); j++)
                    ans[ind++] = it.getKey();
            }
        }

        // Utility function to print an array
        static void printArray(int arr[], int n)
        {
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        // Driver code
        public static void main(String[] args)
        {
            int A1[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
            int A2[] = { 2, 1, 8, 3 };
            int n = A1.length;
            int m = A2.length;

            // The ans array is used to store the final sorted
            // array
            int ans[] = new int[n];
            sortA1ByA2(A1, n, A2, m, ans);

            System.out.println("Sorted array is ");
            printArray(ans, n);
        }
    }
    