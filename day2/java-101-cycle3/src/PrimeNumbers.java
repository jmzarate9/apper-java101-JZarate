

public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Hello, World");

        // while Loop
        int ctr = 0;

        while (ctr <= 10) {
            ctr++; // increment
            System.out.println(ctr);
        }

        // do while loop
        System.out.println("--------------------");
        do {
            System.out.println("Wohhooo!");
        } while (false);

        // for loop
        /*while (ctr <= 10) {
            ctr++; // increment
            System.out.println(ctr);
        }*/
        System.out.println("---------------------");
        for (int ctr1 = 1; ctr1 <= 10; ctr1++) {
            System.out.println(ctr1);
        }

        // Prime Numbers

        long startTime = System.nanoTime();

        System.out.println(isPrimeNumber(11));

        long endTime = System.nanoTime();
        System.out.println("Duration: " + (endTime - startTime));

    }

    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i =2; i <= num /2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
