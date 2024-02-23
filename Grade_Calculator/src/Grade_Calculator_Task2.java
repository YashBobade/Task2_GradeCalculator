import java.util.Scanner;

public class Grade_Calculator_Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        System.out.println("==============================");
        int numberOfSubjects = sc.nextInt();

        
        if (numberOfSubjects <= 0) {
            System.out.println("Invalid number of subjects. Please enter a positive number.");
            System.out.println("===========================================================");
            return;
        }

        int totalMarks = 0;

        
        for (int i = 1; i <= numberOfSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + " out of 100: ");
            int marks = sc.nextInt();

            
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                return;
            }

            totalMarks += marks;
        }

        
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        
        char grade;
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

        System.out.println("Results:");
        System.out.println("========");
        System.out.println();        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println();
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println();
        System.out.println("Grade: " + grade);
        System.out.println("Thank You!");
        

        sc.close();
    }
}

