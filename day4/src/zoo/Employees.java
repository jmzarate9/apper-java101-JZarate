package zoo;

public class Employees {
    //--- instance variable ---
    private String name;
    protected double salary;

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
    protected double getSalary() {
        return salary;
    }

    //--- Setter ---
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
