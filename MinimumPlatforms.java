import java.util.Arrays;

public class MinimumPlatforms {
    public static int minimumPlatforms(int [] arr , int[] dep , int n){

        int plat_needed =1 , result =1;

        for(int i =0; i< n; i++){
            //minimum platforms
            plat_needed =1;
            for (int j =0; j<n; j++){
                if(i!=j)
                if(arr[i] >= arr[j] && dep[j] >= arr[j])
                    plat_needed++;
            }
            result = Math.max(result,plat_needed);
        }
        return result;

    }
    public static void main(String[] args) {
        int  arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n =3;
        int res = minimumPlatforms(arr , dep,n);
        System.out.println(res);
    }
}