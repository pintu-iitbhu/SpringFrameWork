package org.springtutorial.autoWired;

public class Chapter {
    private String chName;

    private int chLen;

    public Chapter() {
        super();
    }

    public Chapter(String chName, int chLen) {
        this.chName = chName;
        this.chLen = chLen;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }

    public int getChLen() {
        return chLen;
    }

    public void setChLen(int chLen) {
        this.chLen = chLen;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "chName='" + chName + '\'' +
                ", chLen=" + chLen +
                '}';
    }
}
