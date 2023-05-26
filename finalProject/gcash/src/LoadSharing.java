public interface LoadSharing {
    // Interface for load sharing transactions
        void registerUser(String name, String number);
        void shareLoad(String senderNumber, String recipientNumber, double amount);
        void displayAll();
}
