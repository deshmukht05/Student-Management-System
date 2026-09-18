import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();
        int choice;
        boolean running = true;

        do {
            printMenu();
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    addNewStudent(sc, sms);
                    break;

                case 2:
                    sms.displayStudentDetails();
                    break;

                case 3:
                    System.out.print("Enter roll number to search: ");
                    int rollNumber = sc.nextInt();
                    sms.searchStudent(rollNumber);
                    break;

                case 4:
                    updateStudentMarks(sc, sms);
                    break;

                case 5:
                    System.out.print("Enter roll number to delete: ");
                    int deleteRoll = sc.nextInt();
                    sms.removeStudent(deleteRoll);
                    break;

                case 6:
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid input. Try again!");
            }
        } while(running);
        sc.close();
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("==== Welcome to Student Management System ====");
        System.out.println("1. Add Student");
        System.out.println("2. View All Student");
        System.out.println("3. Search Student");
        System.out.println("4. Update student marks");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addNewStudent(Scanner sc, StudentManagementSystem sms) {
        System.out.println();
        System.out.println("Add Student Details");
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjectCount = sc.nextInt();

        double[] marks = new double[subjectCount];
        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Enter marks of subject " + (i+1) + " : ");
            marks[i] = sc.nextDouble();
        }

        sms.addStudent(new Student(name, rollNumber, marks));
    }

    private static void updateStudentMarks(Scanner sc, StudentManagementSystem sms) {
        System.out.println();
        System.out.println("Update Student Marks");
        System.out.print("Enter roll number to update: ");
        int rollNumber = sc.nextInt();

        Student std = sms.searchStudent(rollNumber);

        if (std == null) return;

        System.out.print("Enter new number of subject: ");
        int subjectCount = sc.nextInt();

        double[] marks = new double[subjectCount];
        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Enter marks of subject " + (i+1) + " : ");
            marks[i] = sc.nextDouble();
        }

        std.setMarks(marks);
        System.out.println("Marks updated successfully.");
        std.displayDetails();
    }
}