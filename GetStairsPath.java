import java.util.ArrayList;
import java.util.Scanner;

public class GetStairsPath {

    public static ArrayList<String> getStairsPath(int n){

        if (n==0){

            ArrayList<String> bres = new ArrayList<>();

            bres.add(" ");

            return bres;

        } else if (n<0) {

            ArrayList<String> bres = new ArrayList<>();

            return bres;
        }
        ArrayList<String> path1 = getStairsPath(n-1);

        ArrayList<String> path2 = getStairsPath(n-2);

        ArrayList<String> path3 = getStairsPath(n-3);

        ArrayList<String> paths = new ArrayList<>();
        
        for (String path: path1){

            paths.add("1" + path);
        }
        for (String path: path2){

            paths.add("2" + path);
        }
        for (String path: path3){

            paths.add("3" + path);
        }
        return paths;


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<String> paths = getStairsPath(n);

        System.out.println(paths);
        
    }
}