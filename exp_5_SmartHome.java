package calculate;

import java.util.Scanner;

//First Interface
interface ControllableDevice {
 void PowerON();
 void PowerOFF();
 void StatusReport();
}

//Second Interface
interface InternetEnabled {
 void ConnectWIFI();
}

//SmartTV Class
class SmartTV implements ControllableDevice, InternetEnabled {
 private boolean power = false;
 private boolean wifi = false;

 public void PowerON() {
     power = true;
 }

 public void PowerOFF() {
     power = false;
 }

 public void ConnectWIFI() {
     wifi = true;
 }

 public void StatusReport() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Turn ON TV? (yes/no): ");
     if (sc.next().equalsIgnoreCase("yes")) PowerON();
     else PowerOFF();

     System.out.print("Connect TV to WiFi? (yes/no): ");
     if (sc.next().equalsIgnoreCase("yes")) ConnectWIFI();

     System.out.println("SmartTV Power: " + (power ? "ON" : "OFF"));
     System.out.println("SmartTV WiFi: " + (wifi ? "Connected" : "Not Connected"));
     System.out.println("---------------------------");
 }
}

//SmartAC Class
class SmartAC implements ControllableDevice, InternetEnabled {
 private boolean power = false;
 private boolean wifi = false;

 public void PowerON() { power = true; }
 public void PowerOFF() { power = false; }
 public void ConnectWIFI() { wifi = true; }

 public void StatusReport() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Turn ON AC? (yes/no): ");
     if (sc.next().equalsIgnoreCase("yes")) PowerON();
     else PowerOFF();

     System.out.print("Connect AC to WiFi? (yes/no): ");
     if (sc.next().equalsIgnoreCase("yes")) ConnectWIFI();

     System.out.println("SmartAC Power: " + (power ? "ON" : "OFF"));
     System.out.println("SmartAC WiFi: " + (wifi ? "Connected" : "Not Connected"));
     System.out.println("---------------------------");
 }
}

//SmartFridge Class
class SmartFridge implements ControllableDevice, InternetEnabled {
 private boolean power = false;
 private boolean wifi = false;

 public void PowerON() { power = true; }
 public void PowerOFF() { power = false; }
 public void ConnectWIFI() { wifi = true; }

 public void StatusReport() {
     Scanner sc = new Scanner(System.in);
     System.out.print("Turn ON Fridge? (yes/no): ");
     if (sc.next().equalsIgnoreCase("yes")) PowerON();
     else PowerOFF();

     System.out.print("Connect Fridge to WiFi? (yes/no): ");
     if (sc.next().equalsIgnoreCase("yes")) ConnectWIFI();

     System.out.println("SmartFridge Power: " + (power ? "ON" : "OFF"));
     System.out.println("SmartFridge WiFi: " + (wifi ? "Connected" : "Not Connected"));
     System.out.println("---------------------------");
 }
}

//Main Class
public class SmartHome {
 public static void main(String[] args) {
     SmartTV tv = new SmartTV();
     SmartAC ac = new SmartAC();
     SmartFridge fridge = new SmartFridge();

     tv.StatusReport();
     ac.StatusReport();
     fridge.StatusReport();
 }
}
