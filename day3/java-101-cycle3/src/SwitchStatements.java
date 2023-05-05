public class SwitchStatements {

    public static void main(String[] args) {
        // sound of the animals
        // Dog arf arf
        // Cat meow meow
        // Goat meeeh meehh
        // Cow moooohh

        Animal animal = Animal.DOG;
//        if (animal.equals("dog")) {
//            System.out.println("arf arf");
//        } else if (animal.equals("cat")) {
//            System.out.println("meow meow");
//        } else if (animal.equals("goat")) {
//            System.out.println("meeehh meeeh");
//        } else if (animal.equals("cow")) {
//            System.out.println(("Moohh"));
//        } else {
//            System.out.println("Yehey!");
//        }

        switch (animal) {
            case DOG: System.out.println("arf arf"); break;
            case CAT: System.out.println("meow meow"); break;
            case GOAT: System.out.println("meeeh meeeh"); break;
            case COW: System.out.println("mooh"); break;
            default:
                System.out.println("yehey!");
        }

        System.out.println("--------------");

        String promoCode = "GCASH_ANNIV_2023";

        switch (promoCode) {
            case "GCASH_ANNIV_2023":
                System.out.println("discount 1");
            case "GCASH_ANNIV_2022":
                System.out.println("discount 2");
        }

        System.out.println("--------------");

        String promoCode2 = "GCASH_ANNIV_2022";

        switch (promoCode2) {
            case "GCASH_ANNIV_2023":
                System.out.println("discount 1");
            case "GCASH_ANNIV_2022":
                System.out.println("discount 2");
        }

        System.out.println("--------------");

//        fall-through, and it allows the code to execute multiple cases if they share the same code block.
//        general rule, it is best to use break statements in a switch statement to make the code more explicit and easier to follow.

        DayOfWeek today = DayOfWeek.SATURDAY;

        switch (today) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend!");
                break;
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("It's a weekday.");
                break;
        }

    }

    public enum Animal {
        DOG, CAT, GOAT, COW;
    }

    public enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

}
