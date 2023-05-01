
// HOMEWORK (PART 1)

// 1. Create a method given a parameter an int value, it should return a boolean (True if prime number, and False otherwise)

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int num) {
        
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    // 2. Call the method inside the public static void main(String[] args)
    public static void main(String[] args) {
        
        Scanner myNumber = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = myNumber.nextInt();

        System.out.println("Is a Prime Number? ");
        if (isPrime(num)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
