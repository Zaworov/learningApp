package pl.zaworov.learningApp.domain;

public class River {

    private String name;
    private int length = 0;
    private String location;

    public String getRiverName() {
        return name;
    }

    public void setRiverName(String name) {
        this.name = name;
    }

    public int getRiverLength() {
        return length;
    }

    public void setRiverLength(int length) {
        this.length = length;
    }

    public String getRiverLocation() {
        return location;
    }

    public void setRiverLocation(String location) {
        this.location = location;
    }
}

