class TrainReservation {
private int availableSeats = 5;
// synchronized method to book ticket
public synchronized void bookTicket(String user, int requestedSeats) {
if (requestedSeats <= availableSeats) {
System.out.println(user + " successfully booked " + requestedSeats + " ticket(s).");
availableSeats -= requestedSeats;
} else {
System.out.println(user + " failed to book tickets. Not enough seats available.");
}
}
}
// Thread class representing a user
class User extends Thread {
private TrainReservation reservationSystem;
private String userName;
private int seatsToBook;
User(TrainReservation system, String userName, int seats) {
this.reservationSystem = system;
this.userName = userName;
this.seatsToBook = seats;
}

public void run() {
reservationSystem.bookTicket(userName, seatsToBook);
}
}
// Main class
public class ReservationSystemDemo {
public static void main(String[] args) {
TrainReservation reservationSystem = new TrainReservation();
User u1 = new User(reservationSystem, "Alice", 2);
User u2 = new User(reservationSystem, "Bob", 3);
User u3 = new User(reservationSystem, "Charlie", 2);
u1.start();
u2.start();
u3.start();
}
}