
public class ClassesQues1 {
    public static void main(String[] args) {

        Student student = new Student ();
        student.setFirstName ("");	// firstName is set to empty string
        student.setLastName ("");	// lastName is set to empty string
        student.setMarks (10);
        System.out.println ("fullName= " + student.getFullName ());
        System.out.println ("pass= " + student.isPass ());
        student.setFirstName ("Sudhir");	// firstName is set to Sudhir
        student.setMarks (80);
        System.out.println ("fullName= " + student.getFullName ());
        System.out.println ("pass= " + student.isPass ());
        student.setLastName ("Dhangar");	// lastName is set to Dhangar
        System.out.println ("fullName= " + student.getFullName ());
    }

    }
