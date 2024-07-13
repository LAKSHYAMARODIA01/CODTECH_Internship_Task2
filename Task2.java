package CODTECH_Internship_Task;

/*Develop a Java program to track and manage student grades. The
program should allow the user to input grades for different subjects or
assignments, calculate the average grade, and display the overall
grade along with any additional information (such as letter grade or
GPA).*/

import java.util.Scanner;

public class Task2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Grade Manager!");

        // Initialize variables
        int numSubjects;
        double[] grades;
        double sum = 0;
        double average;

        // Prompt user to input the number of subjects/assignments
        System.out.print("Enter the number of subjects/assignments: ");
        numSubjects = scanner.nextInt();

        // Create an array to store grades
        grades = new double[numSubjects];

        // Input grades for each subject/assignment
        for (int i = 0; i < numSubjects; i++) {
            System.out.printf("Enter grade for subject/assignment %d: ", i + 1);
            grades[i] = scanner.nextDouble();
            sum += grades[i];
        }

        // Calculate average grade
        average = sum / numSubjects;

        // Display average grade
        System.out.printf("Average grade: %.2f\n", average);

        // Determine letter grade based on average
        String letterGrade = calculateLetterGrade(average);
        System.out.println("Letter grade: " + letterGrade);

        // Optional: Calculate GPA (if you have a GPA scale)
        // double gpa = calculateGPA(average); // Implement calculateGPA method if needed
        // System.out.printf("GPA: %.2f\n", gpa);

        scanner.close();
    }

    // Method to calculate letter grade based on average score
    public static String calculateLetterGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}