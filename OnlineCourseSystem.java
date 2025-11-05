package calculate;

class Course {
    private static int idCounter = 100; // Auto-increment for course IDs
    private int courseId;
    private String courseName;
    private String instructor;

    // Default Constructor
    Course() {
        this.courseId = ++idCounter;
        this.courseName = "General Course";
        this.instructor = "TBA";
    }
    // Parameterized Constructor
    Course(String courseName, String instructor) {
        this.courseId = ++idCounter;
        this.courseName = courseName;
        this.instructor = instructor;
    }
    // Method to display course details
    void displayCourse() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("---------------------------");
    }
}
public class OnlineCourseSystem {
    public static void main(String[] args) {
        // Using Default Constructor
        Course c1 = new Course();

        // Using Parameterized Constructor
        Course c2 = new Course("Java Programming", "Prof. Sharma");
        Course c3 = new Course("Database Systems", "Dr. Jain");

        // Display courses
        c1.displayCourse();
        c2.displayCourse();
        c3.displayCourse();
    }
}
