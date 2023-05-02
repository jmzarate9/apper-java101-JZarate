import java.util.Scanner;

public class PrimeNumberV2 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = myInput.nextInt();

        long startTime = System.nanoTime();

        if (isPrimeNumber(num)) {
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }

        long endTime = System.nanoTime();
        System.out.println("Duration: " + (endTime - startTime));
    }

    public static boolean isPrimeNumber(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}