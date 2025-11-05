import java.util.ArrayList;
import java.util.List;
class Order {
int orderId;
String item;
double amount;
public Order(int orderId, String item, double amount) {
this.orderId = orderId;
this.item = item;
this.amount = amount;
}
public void display() {
System.out.println("Order ID: " + orderId + ", Item: " + item + ", Amount: ₹" + amount);
}
}
public class OrderManagement {
public static void main(String[] args) {
List<Order> orders = new ArrayList<>();
orders.add(new Order(101, "Laptop", 50000));
orders.add(new Order(102, "Phone", 25000));
orders.add(new Order(103, "Keyboard", 1500));
System.out.println("Customer Orders:");
for (Order order : orders) {
order.display();
}
}
}
