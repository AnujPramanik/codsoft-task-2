import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfSubjects;
        double totalMarks = 0;
        double averagePercentage;
        char grade;

        System.out.print("Enter the number of subjects: ");
        numberOfSubjects = scanner.nextInt();

        for (int i = 1; i <= numberOfSubjects; i++) {
            double marks;
            System.out.print("Enter marks obtained in subject " + i + "out of 100: ");
            marks = scanner.nextDouble();

            totalMarks += marks;
        }

        averagePercentage = (totalMarks / numberOfSubjects);

        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }
}