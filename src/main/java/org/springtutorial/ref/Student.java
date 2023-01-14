package org.springtutorial.ref;

public class Student {
    private String studName;
    private College studCol;

    public Student() {
        super();
    }

    public Student(String studName, College studCol) {
        this.studName = studName;
        this.studCol = studCol;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public College getStudCol() {
        return studCol;
    }

    public void setStudCol(College studCol) {
        this.studCol = studCol;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studName='" + studName + '\'' +
                ", studCol=" + studCol +
                '}';
    }
}
