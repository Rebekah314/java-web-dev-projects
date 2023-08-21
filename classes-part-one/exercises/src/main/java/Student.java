public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student (String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        // Drop your getters and setters below for the Student class.
        public String getName() {
                return this.name;
        }
        public void setName(String aName) {
                this.name = aName;
        }
        public int getStudentId() {
                return this.studentId;
        }
        public void setStudentId(String aStudentId) {
                this.name = aStudentId;
        }public int getNumberOfCredits() {
                return this.numberOfCredits;
        }
        private void setNumberOfCredits(String aNumberOfCredits) {
                this.name = aNumberOfCredits;
        }public double getGpa() {
                return this.gpa;
        }
        public void setGpa(String aGpa) {
                this.name = aGpa;
        }
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
