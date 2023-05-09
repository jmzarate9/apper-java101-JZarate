package zoo;

public class Visitors {
    //--- instance variable ---
    private String name;
    private int age;

    //--- default constructor ---
    public Visitors(){
        age = 28;
    };

    //--- parametrized constructor ---
    public Visitors(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // --- Getter ---

    public int getAge() {
        return age;
    }

    //--- Setter ---
    public void setAge(int age) {
        this.age = age;
    }
}
