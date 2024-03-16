public class scratch_61 {
    public static void main(String[] args) {
        String Name = "Prakhar Srivastava";
        int Age = 22;
        char grade = 'A';
        double height = 179.6;
        DisplayDetails(Name,Age,grade,height);
    }
    public static void DisplayDetails(String UserName,int UserAge, char Usergrade, double Userheight ){
        System.out.println("The name is : " + UserName + "The age is : " + UserAge + "The Grade is : " + Usergrade +
                "The height is : " + Userheight);
    }
}