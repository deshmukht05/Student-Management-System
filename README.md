# Student Management System

A console-based Student Management System developed in Java for managing student records, marks, averages, and grades.

## Overview

The Student Management System is a beginner-friendly Java application that allows users to manage student information through a menu-driven console interface.

Users can add students, view all student records, search for a student, update marks, and delete student records. The application also calculates each student's average marks and assigns a grade based on the average.

This project is designed to practice object-oriented programming and basic collection handling in Java.

## Features

- Add a new student.
- View all registered students.
- Search for a student using their roll number.
- Update a student's marks.
- Delete a student record.
- Calculate the average marks of a student.
- Calculate a student's grade.
- Store multiple student objects using `ArrayList`.
- Use a menu-driven console interface.
- Validate student records and user input.
- Handle menu choices using a `switch` statement.

## Technologies Used

- Java
- Object-Oriented Programming
- `ArrayList`
- `Scanner`
- Switch statements
- Arrays
- Basic exception handling

## Project Structure

```text
StudentManagementSystem/
│
├── src/
│   ├── Student.java
│   ├── StudentManagementSystem.java
│   └── Main.java
│
└── README.md
```

## Core Classes

### Student

The `Student` class represents an individual student.

**Fields:**

- `name`
- `rollNumber`
- `marks`
- `attendance` (optional)

**Methods:**

- `calculateAverage()`
- `calculateGrade()`
- `displayDetails()`
- Getters and setters for student fields

The class uses encapsulation by keeping its fields private and providing public methods to access or update the data.

### StudentManagementSystem

The `StudentManagementSystem` class manages a collection of student objects.

**Responsibilities:**

- Add students.
- Remove students by roll number.
- Search for students by roll number.
- Display all students.
- Update student marks.
- Sort students by name or average, if implemented.

### Main

The `Main` class contains the menu-driven console interface. It uses `Scanner` to read user input and a `switch` statement to perform the selected operation.

## Menu Options

```text
1. Add Student
2. View All Students
3. Search Student
4. Update Student Marks
5. Delete Student
6. Exit
```

## Grade Calculation

The grade is calculated according to the student's average marks.

The grading rules can be customized in the program. A basic example is:

```text
Average Marks       Grade
90 - 100            A
75 - 89             B
50 - 74             C
Below 50            F
```

Example grading logic:

```java
if (average >= 90) {
    return "A";
} else if (average >= 75) {
    return "B";
} else if (average >= 50) {
    return "C";
} else {
    return "F";
}
```

## How to Run

### Prerequisites

Make sure the Java Development Kit, or JDK, is installed on your computer.

Check your Java installation using:

```bash
java -version
javac -version
```

### Clone the Repository

```bash
git clone [https://github.com/your-username/student-management-system.git](https://github.com/your-username/student-management-system.git)
```

Replace `your-username` with your GitHub username.

### Navigate to the Project Directory

```bash
cd student-management-system
```

### Compile the Source Files

If the Java files are inside the `src` folder, run:

```bash
javac -d out src/*.java
```

### Run the Application

```bash
java -cp out Main
```

## Example Workflow

```text
1. Add Student

Enter student name: Alice
Enter roll number: 101
Enter number of subjects: 3
Enter marks for subject 1: 85
Enter marks for subject 2: 90
Enter marks for subject 3: 80

Student added successfully.

2. View All Students

Name: Alice
Roll Number: 101
Average Marks: 85.00
Grade: B
```

## Concepts Practiced

- Classes and objects.
- Constructors.
- Methods.
- Encapsulation.
- Private fields.
- Getters and setters.
- Arrays.
- `ArrayList` collections.
- Searching and removing objects.
- Iterating through a collection.
- Input handling using `Scanner`.
- Menu-driven program design.
- Switch statements.
- Basic exception handling.
- Calculating averages and grades.

## Suggested Development Process

The project can be developed incrementally:

1. Create the `Student` class with fields, constructors, and `displayDetails()`.
2. Create a few student objects manually and display their information.
3. Add `calculateAverage()` and `calculateGrade()`.
4. Store students in an `ArrayList`.
5. Add the menu and implement the Add Student option.
6. Implement View All Students.
7. Add Search Student using the roll number.
8. Add Delete Student.
9. Add Update Student Marks.
10. Add input validation and exception handling.

## Input Validation

The application should validate user input where possible.

Examples of validation include:

- Student name should not be empty.
- Roll numbers should be unique.
- Marks should not be negative.
- Marks should not be greater than 100.
- Search should display a message when a student is not found.
- Update and delete operations should verify that the roll number exists.
- Invalid numeric input should be handled using `try-catch`.

Example:

```java
try {
    int rollNumber = scanner.nextInt();
} catch (InputMismatchException e) {
    System.out.println("Please enter a valid numeric roll number.");
    scanner.nextLine();
}
```

## Possible File Structure

One possible implementation structure is:

```java
Student.java
StudentManagementSystem.java
Main.java
```

The `Student` class stores individual student data, the `StudentManagementSystem` class manages the collection of students, and the `Main` class handles user interaction.

## Future Improvements

The following features can be added in future versions:

- Save student records to a text file.
- Load student records when the application starts.
- Add subject names along with subject-wise marks.
- Use a `HashMap<String, Double>` for subject-wise marks.
- Add attendance tracking.
- Validate that roll numbers are unique.
- Sort students by name.
- Sort students by average marks.
- Sort students by grade using `Comparator`.
- Add student attendance reports.
- Connect the application to a database.
- Create a graphical user interface.
- Add unit tests using JUnit.

## Limitations

- Data is stored only while the application is running.
- The application currently uses a console interface.
- There is no database connection.
- File persistence may not be implemented yet.
- The grading scale may need to be customized.
- Subject names and detailed mark records may not be stored separately.

## Learning Objective

The main objective of this project is to practice Java classes, objects, constructors, methods, encapsulation, arrays, and `ArrayList` collections.

This project also demonstrates how a manager class can store and manipulate multiple student objects while providing common operations such as searching, updating, removing, and displaying records.

## Contributing

Contributions and suggestions are welcome.

To contribute:

1. Fork the repository.
2. Create a new branch.
3. Make your changes.
4. Test the application.
5. Create a pull request.

## License

This project is available for educational and personal use. You may modify and reuse the code for learning purposes.

## Author

Created by **Tushar Deshmukh**
