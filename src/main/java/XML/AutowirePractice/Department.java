package XML.AutowirePractice;

import org.springframework.beans.factory.annotation.Autowired;

public class Department {
    private int departmentId;
    private String departmentName;

    public Department(int departmentId,
                      String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Department() {
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", department='" + departmentName + '\'' +
                '}';
    }
}
