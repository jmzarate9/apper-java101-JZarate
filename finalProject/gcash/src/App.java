
public class App {
    public static void main(String[] args) {
        LoadSharingImplementation loadSharing = new LoadSharingImplementation();

        // Users registration
        System.out.println("--- Register an account ----");
        String number = loadSharing.getInput("Enter phone number");
        String name = loadSharing.getInput("Enter name");
        loadSharing.registerUser(name, number);

        // Load Sharing between users
        System.out.println("--- Share a load ----");
        String senderPhoneNumber = loadSharing.getInput("Enter sender phone number");
        String recipientPhoneNumber = loadSharing.getInput("Enter recipient phone number");
        double amount = Double.parseDouble(loadSharing.getInput("Enter amount to share"));
        loadSharing.shareLoad(senderPhoneNumber, recipientPhoneNumber, amount);

        // Display all users and their balances
        loadSharing.displayAll();
    }
}
