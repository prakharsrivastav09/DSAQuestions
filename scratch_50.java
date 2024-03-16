public class scratch_50 {
    public static void main(String[] args) {
        int[] a = new int[]{8, 9, 6, 4};
        int temp;
        for(int i=0; i<a.length; i++ ){
            for(int j=i+1; i<a.length;j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
            System.out.println("Second largest element is :" + a[i]);
        }
        
    }
}