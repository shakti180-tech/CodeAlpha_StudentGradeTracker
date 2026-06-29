Student Grade Tracker

Overview

The Student Grade Tracker is a simple Java console application designed to manage and analyze student grades. It allows users to enter student names and scores, validates the input, stores the information, and generates a statistical report including average, highest, and lowest scores.

This project demonstrates the use of Java concepts such as:

- Classes and Objects
- ArrayList collections
- Loops and conditional statements
- Exception handling
- User input using Scanner
- Data processing and statistical calculations

---

Features

- Add multiple student records
- Input validation for:
  - Empty student names
  - Invalid score entries
  - Score range (0–100)
- Stores data dynamically using "ArrayList"
- Generates a formatted grade report
- Displays:
  - Total number of students
  - Average score
  - Highest score and student name
  - Lowest score and student name
- Handles invalid user input gracefully

---

Technologies Used

- Java
- Java Collections Framework ("ArrayList")
- Scanner Class

---

Project Structure

StudentGradeTracker/
│
├── GradeTracker.java
└── README.md

---

How the Program Works

1. The program starts by displaying a welcome message.
2. Users enter a student's name.
3. Users enter the student's score (0–100).
4. The program validates the entered data.
5. Multiple records can be added.
6. Enter "exit" as the student name to stop entering records.
7. A statistical summary report is displayed.

---

Sample Output

=== Welcome to the Student Grade Tracker ===

Enter student name (or type 'exit' to finish): shakti
Enter score for John (0 - 100): 85

Enter student name (or type 'exit' to finish): Sarah
Enter score for Sarah (0 - 100): 92

Enter student name (or type 'exit' to finish): satyam
Enter score for Mike (0 - 100): 78

Enter student name (or type 'exit' to finish): exit


===========================================
             STUDENT GRADE REPORT
===========================================
Student Name        | Score
-------------------------------------------
shakti                | 85.00
Sarah               | 92.00
satyam               | 78.00

===========================================
             STATISTICAL SUMMARY
===========================================
Total Students : 3
Class Average  : 85.00
Highest Score  : 92.00 (Sarah)
Lowest Score   : 78.00 (satyam)
===========================================

---

How to Compile and Run

Compile

javac GradeTracker.java

Run

java GradeTracker

---

Code Components

Student Class

The "Student" class stores:

- Student name
- Student score

Methods:

- "getName()"
- "getScore()"

GradeTracker Class

Responsible for:

- Taking user input
- Validating entries
- Storing student objects
- Calculating statistics
- Displaying reports

-

Possible enhancements:

- Assign letter grades (A, B, C, etc.)
- Save records to a file
- Read student data from CSV files
- Add student IDs
- Sort students by scores
- Create a graphical user interface (GUI)
- Database integration

---

Learning Outcomes

This project helps in understanding:

- Object-Oriented Programming (OOP)
- Java collections
- Exception handling
- Data validation
- Basic statistical operations

---

Author - Shakti Kumar Rai

Created as a Java programming project for learning and practice.# CodeAlpha_StudentGradeTracker
