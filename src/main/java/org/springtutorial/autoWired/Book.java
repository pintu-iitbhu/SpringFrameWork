package org.springtutorial.autoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Book {
    private String bName;

    @Qualifier("cName1")
    @Autowired
    private Chapter cName;

    public Book() {
        super();
    }

    @Autowired
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
