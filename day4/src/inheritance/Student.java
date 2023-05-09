package inheritance;

public class Student extends Person {
    //--- Instance Variable ---
    private int gradeLevel;

    //--- Parameterized Constructor ---
    public Student(String name, int age, int gradeLevel) {
        super(name, age);
        this.gradeLevel = gradeLevel;
    }

    public void study() {
        System.out.println("I am studying in grade " + gradeLevel + ".");
    }
}
