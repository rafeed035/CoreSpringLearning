package XML.Entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Building implements InitializingBean, DisposableBean {

    private int buildingId;
    private String buildingName;

    public Building(int buildingId, String buildingName) {
        System.out.println("Initializing properties");
        this.buildingId = buildingId;
        this.buildingName = buildingName;
    }

    public Building() {
    }

    public int getBuildingId() {
        return buildingId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    @Override
    public String toString() {
        return "Building{" +
                "buildingId=" + buildingId +
                ", buildingName='" + buildingName + '\'' +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("inside the destroy method of building class");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("inside the init method of the building class");
    }
}
