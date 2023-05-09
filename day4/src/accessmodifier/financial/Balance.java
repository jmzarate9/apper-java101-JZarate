package accessmodifier.financial;

public class Balance {
    //public int amount; // public can access
    private int amount; // private cant access unless use getter and setter function

    public int getBalance() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount < 900) {
            this.amount = 900;
        } else {
            this.amount = amount;
        }
    }


}
