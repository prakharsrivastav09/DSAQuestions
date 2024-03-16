public class scratch_58 {
    public static void main(String[] args) {
        boolean barking = shouldWakeup(true , 78);
        System.out.println(barking);
    }
    public static boolean shouldWakeup(boolean barking,int houroftheday){
        if(houroftheday>1 && houroftheday<=23){
            if ( barking== true || houroftheday<8 && houroftheday>22){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}