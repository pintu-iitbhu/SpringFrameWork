package org.springtutorial.constructInject;

public class Certi {
    private String certiName;
    private String certiStatus;

    public Certi(String certiName, String certiStatus) {
        this.certiName = certiName;
        this.certiStatus = certiStatus;
    }

    @Override
    public String toString() {
        return "Certi{" +
                "certiName='" + certiName + '\'' +
                ", certiStatus='" + certiStatus + '\'' +
                '}';
    }
}
