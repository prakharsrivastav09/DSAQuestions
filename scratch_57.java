 public class scratch_57 {
     public static void main(String[] args) {
         boolean responce = shouldwakeup(true, 0);
         System.out.println(responce);
     }

     public static boolean shouldwakeup(boolean barking, int houroftheday) {
         if (houroftheday > 1 && houroftheday <= 23) {
             if (barking==true || houroftheday < 8 && houroftheday > 22){
                 return true;
             } else {
                 return false;
             }
         }
         return false;
     }
}