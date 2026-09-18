import java.util.Arrays;

public class Student {
    private String name;
    private int rollNumber;
    private double[] marks;

    public Student(String name, int rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Calculate Average
    public double calAverage() {
        if (marks.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double m:marks){
            sum += m;
        }
        return sum/marks.length;
    }

    // Grading according to marks
    public char calGrade() {
        double avg = calAverage();

        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 50) return 'C';
        else return 'F';
    }

    // Display student details
    public void displayDetails() {
        System.out.println("----------------------------------");
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + Arrays.toString(marks));
        System.out.printf("Average     : %.2f%n", calAverage());
        System.out.println("Grade       : " + calGrade());
        System.out.println("----------------------------------");
    }

    // Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double[] getMarks() {
        return marks;
    }

    public void setMarks(double[] marks) {
        this.marks = marks;
    }
}
