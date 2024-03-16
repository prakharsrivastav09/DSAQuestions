import java.util.Scanner;

public class ContainerWithWater {
    public static int ContainerWater(int[] heigth){
        int i =0;
        int j = heigth.length-1;
        int water =0;
        while (i<j){
            int width = j-i;
            int h = Math.min(heigth[i], heigth[j]);
            water = Math.max(water , h * width);

            if (heigth[i]<heigth[j]){
                i++;
            } else {
                j--;
            }
        }
        return water;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] heigth = new int[n];
        for (int i =0; i<n; i++){
            heigth[i] = sc.nextInt();
        }
        int res = ContainerWater(heigth);
        System.out.print(res);
        
    }
}