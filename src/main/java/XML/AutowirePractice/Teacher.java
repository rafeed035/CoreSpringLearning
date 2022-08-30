package XML.AutowirePractice;

public class Teacher {
    private int teacherId;
    private String teacherName;
    private String teacherAddress;
    private Course course;

    public Teacher(int teacherId,
                   String teacherName,
                   String teacherAddress,
                   Course course) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherAddress = teacherAddress;
        this.course = course;
    }

    public Teacher() {
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherAddress() {
        return teacherAddress;
    }

    public void setTeacherAddress(String teacherAddress) {
        this.teacherAddress = teacherAddress;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", teacherAddress='" + teacherAddress + '\'' +
                ", course=" + course +
                '}';
    }
}
