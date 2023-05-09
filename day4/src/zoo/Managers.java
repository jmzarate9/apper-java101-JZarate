package zoo;

public class Managers {
    //--- instance variable ---
    public String name;
    public int age;
    public String title;

    //--- default constructor ---
    public Managers() {};

    //--- parametrized constructor ---
    public Managers(String name, int age, String title) {
        this.name = name;
        this.age = age;
        this.title = title;
    }

    void displayEmployeeSalary() {
        Employees employees = new Employees();

        // setting a salary for employees
        //employees.setSalary(100_000);
        // getting and printing the salary
        System.out.println("Employee salary: " + employees.getSalary());
    }

    void displayAge() {
        Visitors visitors = new Visitors();
        //visitors.setAge(25);
        System.out.println("visitors age: " + visitors.getAge());
    }

    public static void main(String[] args) {
        Managers managers = new Managers();
        // display the employee salary
        managers.displayEmployeeSalary();

        // Try to see if I can get the age
            // display the age of the visitors
        managers.displayAge();


    }

}
