public class scratch_53 {
    public static void main(String[] args) {
//        mydetails();
//        System.out.println("Step 1");
//        mydetails();
        perimeterOfRect(21, 22);
        perimeterOfRect(34, 78);
        double topspeed = speedOfObject(100, 20);
        double x = 40*topspeed;
        System.out.println(x);
    }

    //          public static void mydetails(){
//        String myname = "Prakhar";
//
//              int age = 21;
//              double height = 6.1;
//              System.out.println("My name is : " + myname);
//            System.out.println("My age is : " + age);
//            System.out.println("My height is : " + height);
//
//        }
    public static void perimeterOfRect(int Length, int Breath) {
        double perimeter = 2 * (Length + Breath);
        System.out.println("The perimeter is : " + perimeter);

    }

    public static void SpeedOfObject(double Distance, double time) {
        double Speed = Distance / time;
        System.out.println("The speed is : " + Speed);
    }

    public static double speedOfObject(double Distance, double time){
        double speed = Distance/time;
        return speed;
    }
}