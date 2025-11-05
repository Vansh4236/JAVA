package calculate;

//Base Class
class Person {
 String name;
 int age;
 String branch;

 Person(String name, int age, String branch) {
     this.name = name;
     this.age = age;
     this.branch = branch;
 }

 void Display_Info() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Branch: " + branch);
 }
}

//Subclass Student
class Students extends Person {
 String course;

 Students(String name, int age, String branch, String course) {
     super(name, age, branch);
     this.course = course;
 }

 void Display_Info() {
     super.Display_Info();
     System.out.println("Course: " + course);
     System.out.println("---------------------------");
 }
}

//Subclass Faculty
class Faculty extends Person {
 String grade;

 Faculty(String name, int age, String branch, String grade) {
     super(name, age, branch);
     this.grade = grade;
 }

 void Display_Info() {
     super.Display_Info();
     System.out.println("Grade: " + grade);
     System.out.println("---------------------------");
 }
}

//Subclass Admin
class Admin extends Person {
 double fee;

 Admin(String name, int age, String branch, double fee) {
     super(name, age, branch);
     this.fee = fee;
 }

 // Overriding method
 @Override
 void Display_Info() {
     System.out.println("Admin Fee Details:");
     System.out.println("Name: " + name);
     System.out.println("Branch: " + branch);
     System.out.println("Pending Fee: " + fee);
     System.out.println("---------------------------");
 }
}

//Main Class
public class InheritanceDemo {
 public static void main(String[] args) {
     Person p = new Person("Generic Person", 40, "Administration");
     Students s = new Students("Vansh", 20, "IT", "Java Programming");
     Faculty f = new Faculty("Dr. Deepti", 45, "IT", "A");
     Admin a = new Admin("Mr. Ranjan", 50, "Accounts", 12000.50);

     p.Display_Info();
     System.out.println("---------------------------");
     s.Display_Info();
     f.Display_Info();
     a.Display_Info();
 }
}
