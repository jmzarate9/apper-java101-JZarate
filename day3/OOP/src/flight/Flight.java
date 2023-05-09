package flight;

public class Flight {
    //---- instance variable ----
    int seats;
    int passengers;

    Flight() {
        seats = 10;
        passengers = 0;
    }

    //TODO: validate if there are available seats left. If no, display "Full"

    public void addPassenger() {
        if (passengers >= seats) {
            System.out.println("Flight is full. No more seats available.");
        } else {
            this.passengers++;
        }
    }

    //TODO: set new value of the seat so addPassenger is allowed again.

    public void setNumberOfSeats(int seats) {
        int availableSeats = seats - this.passengers;
        if(availableSeats >= 0 ) {
            this.seats = seats;
        }
    }

}
