package org.springtutorial.constructInject;

public class Person {
    private String personName;
    private String personAddress;
    private Certi personCerti;

    private int personAge;

    public Person(String personName, String personAddress, int personAge, Certi personCerti) {
        this.personName = personName;
        this.personAddress = personAddress;
        this.personAge = personAge;
        this.personCerti= personCerti;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personAddress='" + personAddress + '\'' +
                ", personAge=" + personAge + '\'' +
                ", personCerti" + personCerti +
                '}';
    }
}
