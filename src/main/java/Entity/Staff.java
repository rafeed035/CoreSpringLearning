package Entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Staff {
    private int staffId;
    private String staffName;

    public Staff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }

    public Staff() {
    }

    public int getStaffId() {
        return staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    @PostConstruct
    public void init(){
        System.out.println("Inside init method of the Staff class");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Inside the destroy method of the Staff class");
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                '}';
    }
}
