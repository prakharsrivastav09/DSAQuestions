public class MaxElement {
    static int maxrepeating(int[] arry , int n , int k) {

        for (int i = 0; i < n; i++) {
            arry[(arry[i] % k)] += k;
        }

        int max = 0, result = 0;
        for (int i = 1; i < n; i++) {
            if (arry[i] > max) {
                max = arry[i];
                result=i;

            }
        }
        return result;
    }
    public static void main(String[] args) {

        int arr[] = {2, 4, 5, 3, 4, 1, 7};
        int n = arr.length;
        int k=2;
        System.out.println("Maximum repeating element is: " +
                maxrepeating(arr,n,k));
    }
}