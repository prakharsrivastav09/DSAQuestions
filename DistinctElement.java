public class DistinctElement {
    public static void main(String[] args) {
        int[] arr = {30, 50, 30, 10, 20, 40, 10, 20};
        int n = arr.length;
        //array creadted mark already visited
        int visited[] = new int[n];
        int count_dis = 0;
        for (int i = 0; i < n; i++) {
            //only if visited
            if (visited[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    if(arr[i]==arr[j]){
                        //Mark visited
                        visited[j] = 1;
                    }

                }
                //increase count as current item
                count_dis++;
            }
        }
        System.out.println(count_dis);

    }
}