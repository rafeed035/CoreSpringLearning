package XML.AutowirePractice;

import org.springframework.beans.factory.annotation.Autowired;

public class Course {
    private int courseId;
    private String courseName;
    @Autowired
    private Department department;

    public Course(int courseId,
                  String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public Course() {
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", department=" + department +
                '}';
    }
}
