public class Student {

    private String firstName;
    private String lastName;
    private int studentId;

    public Student(String firstname, String lastName, int studentId) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    public String getFirstMame() {
        return firstName;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = Integer.parseInt(studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId=" + studentId +
                '}';
    }


}