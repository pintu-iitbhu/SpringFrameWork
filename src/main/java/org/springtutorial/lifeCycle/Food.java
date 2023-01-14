package org.springtutorial.lifeCycle;

public class Food {
    private String fName;
    private int fPrice;

    public Food(String fName, int fPrice) {
        System.out.println("Setting the values of fName : ");
        this.fName = fName;
        this.fPrice = fPrice;
    }

    public void init(){
        System.out.println("Running init function...");
    }
    public void destroy(){
        System.out.println("Destroying beans after complition of task");
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getfPrice() {
        return fPrice;
    }

    public void setfPrice(int fPrice) {
        this.fPrice = fPrice;
    }

    @Override
    public String toString() {
        return "Food{" +
                "fName='" + fName + '\'' +
                ", fPrice=" + fPrice +
                '}';
    }
}
