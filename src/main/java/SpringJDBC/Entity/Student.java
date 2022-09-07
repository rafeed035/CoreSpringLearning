package SpringJDBC.Entity;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private String city;

    public Student(int studentId,
                   String firstName,
                   String lastName,
                   String city) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
