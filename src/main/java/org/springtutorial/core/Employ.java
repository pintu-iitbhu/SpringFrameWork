package org.springtutorial.core;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employ {
    private String name;
    private String contact;
    private String address;

    public List<String> getEmpPreComp() {
        return empPreComp;
    }

    public void setEmpPreComp(List<String> empPreComp) {
        this.empPreComp = empPreComp;
    }

    public Set<String> getEmpStacks() {
        return empStacks;
    }

    public void setEmpStacks(Set<String> empStacks) {
        this.empStacks = empStacks;
    }

    public Map<String, String> getEmpExpences() {
        return empExpences;
    }

    public void setEmpExpences(Map<String, String> empExpences) {
        this.empExpences = empExpences;
    }

    private List<String> empPreComp;
    private Set<String> empStacks;

    private Map<String, String> empExpences;

    private Properties cred;

    public Properties getCred() {
        return cred;
    }

    public void setCred(Properties cred) {
        this.cred = cred;
    }

    public Employ() {
        super();
    }

    public Employ(String name, String contact, String address, List<String> empPreComp, Set<String> empStacks, Map<String, String> empExpences, Properties cred) {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.empPreComp = empPreComp;
        this.empStacks = empStacks;
        this.empExpences = empExpences;
        this.cred = cred;
    }

    public Employ(String name, String contact, String address, List<String> empPreComp, Set<String> empStacks, Map<String, String> empExpences) {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.empPreComp = empPreComp;
        this.empStacks = empStacks;
        this.empExpences = empExpences;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", empPreComp=" + empPreComp +
                ", empStacks=" + empStacks +
                ", empExpences=" + empExpences +
                ", cred=" + cred +
                '}';
    }
}
