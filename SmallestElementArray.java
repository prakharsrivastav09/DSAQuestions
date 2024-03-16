import org.w3c.dom.ls.LSOutput;

public class SmallestElementArray {
    public static int getsmallest(int[] arr) {

        int min = 1;

        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i - 1] < min) {

                min = arr[i - 1];
            }
        }
        return min;
    }

    public static int getlargest(int[] arr) {

        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }
        }
        return max;
    }

    //Inbuilt way to solve smallest array
//    private static int getsmallest(Integer[] arr) {
//
//        //Using java collection frame work
//        List<Integer> list = Arrays.asList(arr);
//        //Finding min
//        int max = Collections.max(list);
//        return max;
//    }
//
    public static void main(String[] args) {
//
        int[] arr = {7, 11, 18, -3, -7, 4};
            System.out.println("The largest element is : " + getlargest(arr));
            System.out.println("This smallest element is: " + getsmallest(arr));

        }
    }

