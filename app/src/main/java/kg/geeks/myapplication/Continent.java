package kg.geeks.myapplication;

import java.io.Serializable;

public class Continent implements Serializable {
    private String name;
    private String area;

    public Continent(String name, String area){
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
