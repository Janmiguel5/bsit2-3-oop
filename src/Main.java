public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Rona E. Philip", 26, "Information and Technology", 97, 80, 75);
        Student student2 = new Student("Micheal D. Jordan", 23, "Nursing", 70.5, 75.0, 65.0);
        Student student3 = new Student("Stephen C. Curry", 19, "Crim", 50.0, 55.0, 60.0);


        Student[] students = {student1, student2, student2};
        int passingCount = 0;

        for (Student student : students) {
            System.out.println("\nStudent Information:");
            student.displayInfo();

            double average = student.calculateAverage();
            System.out.println("Average Grade: " + average);
            System.out.println("Letter Grade: " + student.getLetterGrade());


            if (student.isPassing()) {
                System.out.println("Status: PASSING");
                passingCount++;
            } else {
                System.out.println("Status: FAILING");
            }
        }
    }
    
    }
