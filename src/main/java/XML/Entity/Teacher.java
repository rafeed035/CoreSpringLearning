package XML.Entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Teacher {
    private int teacherId;
    private String teacherName;
    private List<String> phoneNumber;
    private Set<String> Address;
    private Map<String, String> courses;
    private Properties properties;

    public Teacher(int teacherId, String teacherName, List<String> phoneNumber, Set<String> address, Map<String, String> courses, Properties properties) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.phoneNumber = phoneNumber;
        Address = address;
        this.courses = courses;
        this.properties = properties;
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

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<String> getAddress() {
        return Address;
    }

    public void setAddress(Set<String> address) {
        Address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", Address=" + Address +
                ", courses=" + courses +
                ", properties=" + properties +
                '}';
    }
}
