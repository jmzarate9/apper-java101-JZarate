package zoo;

public class Employees {
    //--- instance variable ---
    public String name;
    private double salary;

    //--- default constructor ---
    public Employees(){
        salary = 1_000;
    };

    //--- parametrized constructor ---
    public Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void feedAnimal(Animals animal) {
        // code here
    }

    //--- Getter ---
    public double getSalary() {
        return salary;
    }

    //--- Setter ---
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
