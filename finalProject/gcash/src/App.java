
public class App {
    public static void main(String[] args) {
        LoadSharingImpl loadSharing = new LoadSharingImpl();

        // Register new users
        System.out.println("--- Register an account ----");
        String number = loadSharing.getInput("Enter phone number");
//        loadSharing.closeScanner();
        String name = loadSharing.getInput("Enter name");
//        loadSharing.closeScanner();
        loadSharing.registerUser(name, number);

        // Share load between registered users
        System.out.println("--- Share a load ----");
        String senderPhoneNumber = loadSharing.getInput("Enter sender phone number");
//        loadSharing.closeScanner();
        String recipientPhoneNumber = loadSharing.getInput("Enter recipient phone number");
//        loadSharing.closeScanner();
        double amount = Double.parseDouble(loadSharing.getInput("Enter amount to share"));
//        loadSharing.closeScanner();
        loadSharing.shareLoad(senderPhoneNumber, recipientPhoneNumber, amount);


        // Display all users and their balances
        loadSharing.displayUsers();
    }
}
