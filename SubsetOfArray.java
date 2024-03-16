import java.util.HashSet;

public class SubsetOfArray {
    static boolean isSubsetArray(int arr1[] , int arr2[] , int m , int n){
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i =0; i<m; i++){
            if (!hashSet.contains(arr1[i]))
                hashSet.add(arr1[i]);
        }
        for (int i =0; i<n; i++){
            if (!hashSet.contains(arr2[i]))
                return false;
        }
        return true;
    }


    public static void main(String[] args){
        int arr1[] = {11, 3, 7, 1, 5};
        int arr2[] = {11, 3, 7, 1};
        int m = arr1.length;
        int n = arr2.length;
        if (isSubsetArray(arr1,arr2,m,n))
            System.out.println("arr[]1 is a subset of arr2[]");

        else
            System.out.println("Is not a subset of array");
    }
}