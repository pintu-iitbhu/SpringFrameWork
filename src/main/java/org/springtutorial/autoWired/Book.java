package org.springtutorial.autoWired;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
    private String bName;

    @Autowired
    private Chapter cName;

    public Book() {
        super();
    }

    public Book(String bName, Chapter cName) {
        this.bName = bName;
        this.cName = cName;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public Chapter getcName() {
        return cName;
    }


    public void setcName(Chapter cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", cName=" + cName +
                '}';
    }
}
