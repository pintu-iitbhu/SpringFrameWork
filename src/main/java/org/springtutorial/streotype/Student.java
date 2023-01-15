package org.springtutorial.streotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("stud1")
@Scope("prototype")
public class Student {
    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Value("Pintu Yadav")
    private String stName;

    @Value("Patna")
    private String location;

    @Value("#{temp}")
    private List<String> friends;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stName='" + stName + '\'' +
                ", location='" + location + '\'' +
                ", friends='" + friends + '\'' +
                '}';
    }
}
