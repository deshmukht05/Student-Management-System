import java.util.ArrayList;

public class StudentManagementSystem {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student std) {
        if(findByRollNumber(std.getRollNumber()) != null) {
            System.out.println("Student already exists. Student not added.");
        }
        students.add(std);
        System.out.println("Student added.");
    }

    public boolean removeStudent(int rollNumber) {
        Student target = findByRollNumber(rollNumber);
        if (target == null) {
            System.out.println("No student found.");
            return false;
        }
        students.remove(target);
        System.out.println("Student with roll number " + rollNumber + " removed.");
        return true;
    }

    public Student searchStudent(int rollNumber) {
        Student found = findByRollNumber(rollNumber);
        if(found == null) {
            System.out.println("No student found with roll number " + rollNumber + ".");
        }
        else {
            found.displayDetails();
        }
        return found;
    }

    public void displayStudentDetails() {
        if(students.isEmpty()){
            System.out.println("No student found.");
            return;
        }
        for (Student s:students){
            s.displayDetails();
        }
    }

    private Student findByRollNumber(int rollNumber) {
        for (Student s:students) {
            if (s.getRollNumber() == rollNumber){
                return s;
            }
        }
        return null;
    }
}
