package inheritance;

public class Person {
    //--- Instance Variable ---
    protected String name;
    protected int age;

    //--- Parameterized constructor ---
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }

}
