package accessmodifier;

import accessmodifier.financial.Balance;
public class Account {
    //Encapsulation
        // a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit
        // "data hiding" - the variables of a class will be hidden from other classes, and can be accessed only through the methods of the current class.
            //variables/properties as private.
            // provide a public setter and getter function.

    void displayBalance() {
        Balance balance = new Balance();
        //balance.amount = 1_000_000; //ERROR

        balance.setAmount(1_000_000);

        System.out.println(balance.getBalance());
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.displayBalance();
    }


}
