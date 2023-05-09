package flight;

public class App {
    public static void main(String[] args) {
        Flight manilaToBoracay = new Flight();

//        System.out.println("---- Before adding passengers ----");
//        System.out.println("No of passengers: " + manilaToBoracay.passengers);
//        System.out.println("No. of available seats: " + manilaToBoracay.seats);

//        manilaToBoracay.setNumberOfSeats(20);
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();

        manilaToBoracay.addPassenger(); // Full
        manilaToBoracay.setNumberOfSeats(20);

        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();


        System.out.println("Current # of available seats: " + (manilaToBoracay.seats - manilaToBoracay.passengers)); // 7
        System.out.println("Current # of passengers: " + manilaToBoracay.passengers); // 13


//        System.out.println("---- After adding passengers ----");
//        System.out.println("No of passengers: " + manilaToBoracay.passengers);
//        System.out.println("No. of available seats: " + manilaToBoracay.seats);

//        manilaToBoracay.setNumberOfSeats(20);
//
//        System.out.println("No of passengers: " + manilaToBoracay.passengers);
//        System.out.println("No. of available seats: " + manilaToBoracay.seats);
    }
}
