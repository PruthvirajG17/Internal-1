
package vvce.Calculator;

import java.util.Scanner;

public class App {

    // Method to calculate total marks
    public static int calculateTotal(int[] marks) {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    // Method to calculate average marks
    public static double calculateAverage(int total) {
        return total / 5.0;
    }

    // Method to calculate grade
    public static String calculateGrade(double average) {

        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else if (average >= 35) {
            return "E";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        System.out.println("Student Grade Calculator");
        System.out.println("------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Enter marks between 0 and 100.");
                i--;
            }
        }

        int total = calculateTotal(marks);
        double average = calculateAverage(total);
        String grade = calculateGrade(average);

        System.out.println("\n----- Student Result -----");
        System.out.println("Total Marks   : " + total + "/500");
        System.out.println("Average Marks : " + average);
        System.out.println("Grade         : " + grade);

        sc.close();
    }
}
