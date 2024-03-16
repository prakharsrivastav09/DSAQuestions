public class NumberOfPairs {
    public static long Numberpairs(int x[] , int y[], int m, int n){
        long count =0;

        for (int i =0; i<m; i++)

            for (int j=0; j<n; j++)

                if (Math.pow(x[i], y[j]) > Math.pow(y[j], x[i]))

                    count++;

        return count;


    }
    public static void main(String[] args) {
        int[] x = {2, 1, 6};
        int[] y = {1, 5};

        System.out.println(Numberpairs( x, y ,  x.length, y.length));
    }
}