package com.finance.accounts;
public class Account {
private String holderName;
private double balance;
public Account(String holderName, double initialBalance) {
this.holderName = holderName;
this.balance = initialBalance;
}
public void deposit(double amount) {
balance += amount;
System.out.println(holderName + " deposited: ₹" + amount);
}
public void withdraw(double amount) {
if (amount <= balance) {
balance -= amount;
System.out.println(holderName + " withdrew: ₹" + amount);
} else {
System.out.println("Insufficient balance for withdrawal.");
}
}
public void showBalance() {
System.out.println("Account Holder: " + holderName);
System.out.println("Current Balance: ₹" + balance);
}
public double getBalance() {
return balance;
}
}

File 2: com/finance/tax/TaxCalculator.java

package com.finance.tax;
public class TaxCalculator {
public double calculateTax(double income) {
if (income <= 250000) {
return 0;
} else if (income <= 500000) {
return (income - 250000) * 0.05;
} else if (income <= 1000000) {
return 12500 + (income - 500000) * 0.20;
} else {
return 112500 + (income - 1000000) * 0.30;
}
}
}
File 3: MainApp.java
import com.finance.accounts.Account;
import com.finance.tax.TaxCalculator;
public class MainApp {
public static void main(String[] args) {
Account acc = new Account("Ravi Kumar", 750000);
acc.deposit(25000);
acc.withdraw(100000);
acc.showBalance();
TaxCalculator taxCalc = new TaxCalculator();
double tax = taxCalc.calculateTax(acc.getBalance());
System.out.println("Estimated Tax Payable: ₹" + tax);
}
}