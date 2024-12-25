
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Maths Marks :");
        int sub1 = sc.nextInt();

        System.out.print("Enter Science Marks :");
        int sub2 = sc.nextInt();

        System.out.print("Enter Hindi Marks :");
        int sub3 = sc.nextInt();

        System.out.print("Enter Gujrati Marks :");
        int sub4 = sc.nextInt();

        System.out.print("Enter S.S Marks :");
        int sub5 = sc.nextInt();

        System.out.print("Enter English Marks :");
        int sub6 = sc.nextInt();

        int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;
        System.out.println("Total Marks = " + totalMarks);

        int average_percentage = totalMarks / 6;
        System.out.println("Percentage = " + average_percentage + "%");

        if (average_percentage >= 90 && average_percentage <= 100) {
            System.out.println("Grade: A+");
            System.out.println("Note: Excellent!");
        } else if (average_percentage >= 80 && average_percentage < 90) {
            System.out.println("Grade: A");
            System.out.println("Note: Great Job! Stay Consistent!");
        } else if (average_percentage >= 70 && average_percentage < 80) {
            System.out.println("Grade: B+");
            System.out.println("Note: Good Work!");
        } else if (average_percentage >= 60 && average_percentage < 70) {
            System.out.println("Grade: B");
            System.out.println("Note: Doing Well! Improve Sted");

        } else if (average_percentage >= 50 && average_percentage < 60) {
            System.out.println("Grade: C");
            System.out.println("Note: Keep Trying! you can do better.");
        } else if (average_percentage >= 40 && average_percentage < 50) {
            System.out.println("Grade: D");
            System.out.println("Note: Don't Give up! Focus & Learn");
        } else if (average_percentage < 40 && average_percentage >= 0) {
            System.out.println("Grade: F");
            System.out.println("Note: Failure is the First Step to Sucess. Work Harder!");
        } else {
            System.out.println("plese enter valid numbers");
        }

    }
}
