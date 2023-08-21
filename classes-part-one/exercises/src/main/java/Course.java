import java.util.ArrayList;

public class Course {
    private String courseName;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    protected Course(String courseName, Teacher instructor, ArrayList<Student> enrolledStudents) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }


    public String getCourseName() {
        return this.courseName;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return this.enrolledStudents;
    }
}
