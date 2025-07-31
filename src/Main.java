import java.util.Scanner;

public class StudentInfoBasic {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("ENTER STUDENT INFORMATION");
        
        System.out.print("Enter Student ID: ");
        String studentId = input.nextLine();
        
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();
        
        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();
        
        System.out.print("Enter Course: ");
        String course = input.nextLine();
        
        System.out.print("Enter Section: ");
        String section = input.nextLine();

        System.out.println("\nSTUDENT INFORMATION");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        System.out.print("\nEnter Midterm Score: ");
        int midTerm = input.nextInt();
        
        System.out.print("Enter Final Score: ");
        int finalExam = input.nextInt();
        
        System.out.print("Enter Project Score: ");
        int project = input.nextInt();
        
        System.out.print("Enter Attendance Score: ");
        int attendance = input.nextInt();
      
        int total = midTerm + finalExam + project + attendance;
        double average = total / 4.0;

        String remarks = (average < 75) ? "FAILED" : "PASSED";

        System.out.println("\nSTUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midTerm);
        System.out.println("Final Exam Score: " + finalExam);
        System.out.println("Project Score: " + project);
        System.out.println("Attendance Score: " + attendance);

        System.out.println("\nAverage Score: " + average);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
