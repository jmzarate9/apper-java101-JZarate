import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Interface for load sharing transactions
interface LoadSharing {
    void registerUser(String name, String number);
    void shareLoad(String senderNumber, String recipientNumber, double amount);
    void displayUsers();
}

// User class representing registered users
class User {
    private String name;
    private String number;
    private double currentLoadBalance;

    public User(String name, double currentLoadBalance) {
        this.name = name;
        this.currentLoadBalance = currentLoadBalance;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return currentLoadBalance;
    }

    public void setCurrentLoadBalance(double currentLoadBalance) {
        this.currentLoadBalance = currentLoadBalance;
    }
}

// Implementation of LoadSharing interface
class LoadSharingImpl implements LoadSharing {
    private Map<String, User> users;
    private Scanner scanner;

    public LoadSharingImpl() {
        users = new HashMap<>();
        scanner = new Scanner(System.in);

        users.put("09175861661", new User("Bob", 100));
        users.put("09175861662", new User("Marley", 100));
        users.put("09175861663", new User("Seth", 100));
        users.put("09175861664", new User("Ryan", 100));
        users.put("09175861665", new User("Fritz", 100));
    }

    // Method to register a new user
    public void registerUser(String name, String number) {
        System.out.println("------------------------------------------------------------------");
        if (number.isEmpty()) {
            System.out.println("Number is empty. Enter a 11-digit number (0900-000-0000).");
            System.exit(0);
            return;

        } else if (number.length() != 11) {
            System.out.println("Invalid Number! Enter a 11-digit number (0900-000-0000).");
            System.exit(0);
            return;

        } else if (users.containsKey(number)) {
            System.out.println("Phone number already exist.");
            System.exit(0);
            return;
        }

        if (name.isEmpty()) {
            System.out.println("Invalid name. Name must not be empty.");
            System.exit(0);
            return;
        }



        users.put(number, new User(name, 100.00));
        System.out.println("User " + name + " registered successfully.");

        System.out.println("------------------------------------------------------------------");
    }

    // Method to share load from one user to another
    public void shareLoad(String senderNumber, String recipientNumber, double amount) {
        User sender = users.get(senderNumber);
        User recipient = users.get(recipientNumber);
        System.out.println("------------------------------------------------------------------");

        if(sender == recipient) {
            System.out.println("Sender and recipient cannot be the same.");
            System.exit(0);
            return;

        } else if (!users.containsKey(senderNumber)) {
            System.out.println("Sender number " + "(" + senderNumber +")" + " not found.");
            System.exit(0);
            return;

        } else if (!users.containsKey(recipientNumber)) {
            System.out.println("Recipient number " + "(" + recipientNumber +")" + " not found.");
            System.exit(0);
            return;

        } else if (sender.getBalance() < amount) {
            System.out.println("Insufficient balance in the sender's account.");
            //System.exit(0);
            return;
        }

        System.out.println("------------------------------------------------------------------");

        // Set the currentLoad Balance
        sender.setCurrentLoadBalance(sender.getBalance() - amount);
        recipient.setCurrentLoadBalance(recipient.getBalance() + amount);

        System.out.println("Load of " + amount + " was shared successfully from " + sender.getName()  + " (" + senderNumber + ") to " + recipient.getName() + " (" + recipientNumber + ").");

        System.out.println("------------------------------------------------------------------");
    }

    // Method to display all users and their balances
    public void displayUsers() {
        System.out.println("---- Current balances: ----");
        for (Map.Entry<String, User> entry : users.entrySet()) {
            String number = entry.getKey();
            User user = entry.getValue();
            System.out.println("Name: " + user.getName() + ", Number: " + number + ", Load Balance: $" + user.getBalance());
        }
    }

    // Helper method to get user input from the console
    public String getInput(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }
}

