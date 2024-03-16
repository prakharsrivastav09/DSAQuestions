public class scratch_54 {
    public static void main(String[] args) {
        String Name = "Prakhar";
        int studentmarks = 76;
       char Stugrade = GradeingSystem(studentmarks);
    }
    public static char GradeingSystem(int marks){
        char GradingSystem;
        if (marks>90 && marks<=100){
            System.out.println("Grade A");
        } else if (marks>80 && marks<=90) {
            System.out.println("Grades B");

        }
        return GradingSystem;
    }

}