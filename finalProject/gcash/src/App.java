import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        LoadSharingImplementation loadSharing = new LoadSharingImplementation();
        Scanner scanner = new Scanner(System.in);

        boolean appRunning = true;

        while(appRunning) {
            System.out.println("------------ LOAD SHARING APP ------------");
            System.out.println("1. Register an account");
            System.out.println("2. Share a Load");
            System.out.println("3. Display all users and balances");
            System.out.println("4. Exit");
            System.out.println("-----------------------------------------");
            System.out.print("Please enter your choices: ");

            int userChoice = Integer.parseInt(scanner.nextLine());

            switch (userChoice) {
                case 1:
                // Users registration
                System.out.println("--- Register an account ----");
                String number = loadSharing.getInput("Enter phone number");
                String name = loadSharing.getInput("Enter name");
                loadSharing.registerUser(name, number);
                break;

                case 2:
                // Load Sharing between users
                System.out.println("--- Share a load ----");
                String senderPhoneNumber = loadSharing.getInput("Enter sender phone number");
                String recipientPhoneNumber = loadSharing.getInput("Enter recipient phone number");
                double amount = Double.parseDouble(loadSharing.getInput("Enter amount to share"));
                loadSharing.shareLoad(senderPhoneNumber, recipientPhoneNumber, amount);
                break;

                case 3:
                // Display all users and their balances
                loadSharing.displayAll();
                break;

                case 4:
                    appRunning = false;
                    System.out.println("Exiting the application. Thank You!");
                    break;

                default:
                    System.out.println("Invalid choice. Please Try Again!");
                    break;
            }

        }

        scanner.close();
    }
}
