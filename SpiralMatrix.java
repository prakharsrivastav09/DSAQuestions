import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        for (int i =0; i< arr.length; i++){
            for (int j =0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int minrow =0;
        int mincol =0;
        int maxrow = arr.length-1;
        int maxcol = arr[0].length-1;

        int tne = n*m;
        int count =0;
        //leftWall
        while (count<tne){
            if(count<tne) {
                for (int i = minrow; i <= maxrow; i++) {
                    System.out.println(arr[i][mincol]);
                    count++;
                }
            }
            mincol++;
            //bottomwall
            if (count<tne){
                for (int i =mincol; i<=maxcol; i++){
                    System.out.println(arr[maxrow][i]);
                    count++;
                }
            }
            maxrow--;

            //rightwall
            if (count<tne){
                for (int i =maxrow; i>=minrow; i--){
                    System.out.println(arr[i][maxcol]);
                    count++;
                }
            }
            maxcol--;

            //upperwall
            if(count<tne){
                for (int i =maxcol; i>=mincol; i--){
                    System.out.println(arr[minrow][i]);
                    count++;

                }
            }
            minrow++;

        }

    }
}