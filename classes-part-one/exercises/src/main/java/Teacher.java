public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return this.firstName;
    }
    protected void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    protected void setLastName(String aLastName) {
        this.lastName = aLastName;
    }
    public String getSubject() {
        return this.subject;
    }
    protected void setSubject(String aSubject) {
        this.firstName = aSubject;
    }
    public int getYearsTeaching() {
        return this.yearsTeaching;
    }
    protected void setYearsTeaching(int aYearsTeaching) {
        this.yearsTeaching = aYearsTeaching;
    }
}
