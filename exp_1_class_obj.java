package calculate;

class Student {
    int id;
    String name;
    String course;

    void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}
class Book {
    String title;
    String author;
    double price;

    void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
class Account {
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    void displayBalance() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
public class RealLifeEntities {
    public static void main(String[] args) {
        // Student object
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Rahul Sharma";
        s1.course = "IT";
        s1.displayDetails();

        System.out.println();

        // Book object
        Book b1 = new Book();
        b1.title = "Java Programming";
        b1.author = "Herbert Schildt";
        b1.price = 599.50;
        b1.displayBook();

        System.out.println();

        // Account object
        Account acc1 = new Account();
        acc1.accountNumber = 12345;
        acc1.balance = 1000;
        acc1.displayBalance();
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.displayBalance();
    }
}
