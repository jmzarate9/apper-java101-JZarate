public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //Variables
            // it holds a value,
            // it stores in RAM
        //example:
        int age = 15;

        // numeric whole number data types: short, int, long
        System.out.println(age);

        age = age + 10;
        System.out.println(age);

        long myBalanceInGcash = 1000000000;
        //int newBalance = myBalanceInGcash + age;
            // will not work since "long" has a bigger data type, it should have same byte.
        long newBalance = myBalanceInGcash + age; //NOTE: newBalance should not be int
        System.out.println(newBalance);

        //decimal: double and float
        double price = 4.45;
        double newPrice = price + age;
        System.out.println(newPrice);

        float discount = 9.56f;
        double subtotal = newPrice + discount;
        System.out.println(subtotal);
        
        double num1 = 1;
        float num2 = 4000.54f;
        double result = num1 + num2;
        System.out.println(result);

        int resultMaxValue = Integer.MAX_VALUE + Integer.MAX_VALUE;
        System.out.println(resultMaxValue);


    }
}
