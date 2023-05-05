package oop.app;

import oop.app.blueprint.Person;

public class App {
    public static void main(String[] args) {
        Person mark = new Person();
        mark.age = 19;
        mark.name = "Mark Kram";
        mark.isMale = true;
        mark.relationshipStatus = "single";
        mark.citizenship = "Filipino";

        System.out.println(mark.getNameWithPrefix());
        mark.getJob();
    }


}
