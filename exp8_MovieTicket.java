import java.util.Queue;
public class MovieTicketSystem {
public static void main(String[] args) {
Queue<String> ticketQueue = new LinkedList<>();
// People joining queue
ticketQueue.offer("Amit");
ticketQueue.offer("Riya");
ticketQueue.offer("Sohan");
System.out.println("Booking Movie Tickets (FIFO Order):");
while (!ticketQueue.isEmpty()) {
String person = ticketQueue.poll();
System.out.println("Ticket booked for: " + person);
}
}
}
