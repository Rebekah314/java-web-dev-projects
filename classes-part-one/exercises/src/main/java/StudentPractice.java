import java.util.ArrayList;


public class StudentPractice {
    public static void main(String[] args){
        Integer love = 143;
        //instantiate your Student class below
        Student bekah = new Student("Bekah", 80004, 1, 4.0);
        System.out.println(bekah.getName() + "," + bekah.getStudentId()
                + "," + bekah.getNumberOfCredits() + "," + bekah.getGpa());
        Student erik = new Student("Erik", 63119, 4, 4.0);
        System.out.println(erik.getName() + "," + erik.getStudentId()
                + "," + erik.getNumberOfCredits() + "," + erik.getGpa());
        Student calvin = new Student("Calvin", 12345, 2, 3.5);
        System.out.println(calvin.getName() + "," + calvin.getStudentId()
                + "," + calvin.getNumberOfCredits() + "," + calvin.getGpa());
        System.out.println("\n");

        ArrayList<Student> students = new ArrayList<>();
        students.add(bekah);
        students.add(erik);
        students.add(calvin);

        Teacher clinton = new Teacher("Clinton", "Garris", "Nintendo", 3);
        Course fall = new Course("Nintendo for Newbs", clinton, students);
        System.out.println("Course offering this fall! ");
        System.out.println("Instruction: " + clinton.getFirstName() + " " + clinton.getLastName() +
                " has taught in the department of " + clinton.getSubject()
                + " for " + Integer.toString(clinton.getYearsTeaching()) + " years.");
        System.out.println("Course Name: " + fall.getCourseName());
        System.out.println("Number students enrolled: " + fall.getEnrolledStudents().size());

    }

}
