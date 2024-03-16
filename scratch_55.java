public class scratch_55 {
    public static void main(String[] args) {
        String Name = " Prakhar ";
        int studentMarks = 89;
        char stugrade = Grades(studentMarks);
        DisplayDetails(Name,stugrade);
    }
    public static char Grades(int marks){
        char Grades = 0;
        if(marks>90 && marks<=100){
            System.out.println("Grades A");
        } else if (marks>80 && marks<=90) {
            System.out.println("Grades B");
        } else if (marks>70 && marks<=80) {
            System.out.println("Grades C");
        } else if (marks>60 && marks<=70) {
            System.out.println("Grades D");
        } else if (marks>50 && marks<=60) {
            System.out.println("Grades E");
        } else  {
            System.out.println("You're fail");
            return Grades;

        }
        return 0;
    }
    public static void DisplayDetails(String name , char StuGrades){
        System.out.println("Student name is :" + name + " He/she grade is : " + Grades(89));
    }
}