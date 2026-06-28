import java.util.ArrayList;
import java.util.Scanner;

// Class to represent an individual Student
class Student {
    String name;
    double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}

// Main class to manage grades and handle user interface
    class GradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        System.out.println("=== Welcome to the Student Grade Tracker ===");
        
        while (true) {
            System.out.print("\nEnter student name (or type 'exit' to finish): ");
            String name = sc.nextLine().trim();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. Please try again.");
                continue;
            }

            double score = -1;
            while (score < 0 || score > 100) {
                System.out.print("Enter score for " + name + " (0 - 100): ");
                try {
                    score = Double.parseDouble(sc.nextLine());
                    if (score < 0 || score > 100) {
                        System.out.println("Invalid input. Score must be between 0 and 100.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid numerical score.");
                }
            }

            // Add the valid student entry to our ArrayList
            studentList.add(new Student(name, score));
        }

        // Display summary report if students exist
        if (studentList.isEmpty()) {
            System.out.println("\nNo data entered. Exiting program.");
        } else {
            displaySummaryReport(studentList);
        }

        sc.close();
    }

    private static void displaySummaryReport(ArrayList<Student> students) {
        double totalSum = 0;
        double highestScore = Double.MIN_VALUE;
        double lowestScore = Double.MAX_VALUE;
        
        String topStudent = "";
        String lowestStudent = "";

        System.out.println("\n===========================================");
        System.out.println("             STUDENT GRADE REPORT          ");
        System.out.println("===========================================");
        System.out.printf("%-20s | %-10s\n", "Student Name", "Score");
        System.out.println("-------------------------------------------");

        for (Student s : students) {
            double currentScore = s.getScore();
            String currentName = s.getName();
            
            // Display row
            System.out.printf("%-20s | %-10.2f\n", currentName, currentScore);

            // Calculations
            totalSum += currentScore;

            if (currentScore > highestScore) {
                highestScore = currentScore;
                topStudent = currentName;
            }

            if (currentScore < lowestScore) {
                lowestScore = currentScore;
                lowestStudent = currentName;
            }
        }

        double averageScore = totalSum / students.size();

        System.out.println("===========================================");
        System.out.println("             STATISTICAL SUMMARY           ");
        System.out.println("===========================================");
        System.out.printf("Total Students : %d\n", students.size());
        System.out.printf("Class Average  : %.2f\n", averageScore);
        System.out.printf("Highest Score  : %.2f (%s)\n", highestScore, topStudent);
        System.out.printf("Lowest Score   : %.2f (%s)\n", lowestScore, lowestStudent);
        System.out.println("===========================================");
    }
}