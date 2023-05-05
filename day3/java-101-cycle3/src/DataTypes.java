public class DataTypes {

    // Zero value
    static int age;
    static double salary;
    static boolean isHappy;
    static char favoriteLetter;
    static float weight;
    static long distance;
    static Integer wrapperAge;
    static  Boolean wrapperIsHappy;

    public static void main(String[] args) {
        System.out.println(age);
        System.out.println(salary);
        System.out.println(isHappy);
        System.out.println(favoriteLetter);
        System.out.println(weight);
        System.out.println(distance);

        // Wrapper Class
        System.out.println(age + " " + wrapperAge);
        System.out.println(isHappy + " " + wrapperIsHappy);

//        System.out.println((wrapperAge + 10));

        Integer theAge = 10;
        System.out.println(theAge);

        theAge = theAge + 89;
        System.out.println(theAge);

        System.out.println("-------------------");
        displayAgeInAFancyWay(theAge);
        System.out.println("Value of theAge after calling fancy method: " + theAge);

        System.out.println("-------------------");
        //pass by reference
        Integer[] ages = new Integer[]{100};
        System.out.println(ages[0]);
        displayAgeInAFancyWay(ages);

        System.out.println("Value of theAge after calling fancy method: " + ages[0]);

        System.out.println("-------------------");
        //primitive to wrapper
        int numUsers = 100;
        Integer numberOfUsers = new Integer(numUsers);
        // same with this
//        Integer numberOfUsers = numUsers;

        System.out.println(numberOfUsers.intValue());

        System.out.println("-------------------");
        int a = 9;
        int b = 10;
        int c = 80;

        System.out.println((a + b) * c % 4);

        System.out.println(c++ + " " + ++c);
        System.out.println(c++); // 82 + 1 but output is 82
        System.out.println(++c); // 83 + 1 but output is 84
        System.out.println(c);

    }

    static void displayAgeInAFancyWay(Integer age) {
        System.out.println("Fancy! " + age);
        age = age + 100;
    }

    static void displayAgeInAFancyWay(Integer[] age) {
        System.out.println("Fancy! " + age[0]);
        age[0] = age[0] + 100;
    }

}
