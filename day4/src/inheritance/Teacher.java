package inheritance;

public class Teacher extends Person {
    //--- Instance Variable ---
    private String subject;

    //--- Parameterized Constructor ---
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void teach() {
        System.out.println("I am teaching " + subject + ".");
    }
}
