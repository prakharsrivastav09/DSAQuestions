public class MaxNoMatrix {
    static int numberOfways(int m, int n) {
        if (m == 1 || n == 1)
            return 1;

            return numberOfways(m - 1, n) + numberOfways(n - 1, m);
    }
    public static void main(String[] args) {

        System.out.println(numberOfways(3,3));
    }
}