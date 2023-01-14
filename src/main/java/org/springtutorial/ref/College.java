package org.springtutorial.ref;

public class College {
    private String colName;
    private String colLocation;

    public College() {
        super();
    }

    public College(String colName, String colLocation) {
        this.colName = colName;
        this.colLocation = colLocation;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public String getColLocation() {
        return colLocation;
    }

    public void setColLocation(String colLocation) {
        this.colLocation = colLocation;
    }

    @Override
    public String toString() {
        return "College{" +
                "colName='" + colName + '\'' +
                ", colLocation='" + colLocation + '\'' +
                '}';
    }
}
