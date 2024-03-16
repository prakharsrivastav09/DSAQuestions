public class Binaryfunction {
    public static int binaryfunction(int[] array, int left, int right, int x) {

        if (right >= left) {

            int mid = left + (right - left) / 2;

            if (array[mid] == x)

                return mid;

            if (array[mid] > x)
                
                return binaryfunction(array, left, mid - 1, x);
            else
                return binaryfunction(array, mid + 1, right, x);
        }
        return -1;
    }
        public static void main (String args[]){
            int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
            int x = 90;
            int size = array.length;
            int result = binaryfunction(array, 0,size-1, x);
            if (result == -1) {
                System.out.println("Element not found");
            } else {
                System.out.println(" The value is : " + x + " at index " + result);
            }
        }
    }
