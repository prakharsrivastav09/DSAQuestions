public class Areas {
    public static void main(String[] args) {
        int lenght = 6;
        int breath = 7;
        double height = 12.5;
        Area(6);
        Area(4,8);
        Area(12,89);
    }

    public static void Area(int side) {
        double Areaofsquare = side * side;
        System.out.println("The area of sqaure is : " + Areaofsquare);
    }

    public static void Area(int lenght, int breadth) {
        double Areaofrectangle = lenght * breadth;
        System.out.println("The area of rectangle is : " + Areaofrectangle);
    }

    public static void Area(int breadth, double height) {
        double Areaoftriangle = 0.5 * breadth * height;
        System.out.println("The area of Triangle is : " + Areaoftriangle);

    }
}