package XML.Entity;

import java.util.List;

public class Department {
    private int departmentId;
    private String departmentName;
    private List<Course> courseList;

    public Department(int departmentId, String departmentName, List<Course> courseList) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.courseList = courseList;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}
