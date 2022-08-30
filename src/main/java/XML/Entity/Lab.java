package XML.Entity;

public class Lab {
    private int labId;
    private String labName;

    public Lab(int labId, String labName) {
        this.labId = labId;
        this.labName = labName;
    }

    public Lab() {
    }

    public int getLabId() {
        return labId;
    }

    public String getLabName() {
        return labName;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "labId=" + labId +
                ", labName='" + labName + '\'' +
                '}';
    }

    public void init(){
        System.out.println("Inside the init method of lab class");
    }

    public void destroy(){
        System.out.println("Inside the destroy method of the lab class");
    }
}
