package inheritance;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        person.introduce(); // Hi, my name is John and I am 30 years old.

        Student student = new Student("Jane Doe", 20, 2);
        student.introduce(); // Hi, my name is Jane and I am 20 years old.
        student.study(); // I am studying in grade 2.

        Teacher teacher = new Teacher("Mary", 40, "Math");
        teacher.introduce(); // Hi, my name is Mary and I am 40 years old.
        teacher.teach(); // I am teaching Math.
    }
}
