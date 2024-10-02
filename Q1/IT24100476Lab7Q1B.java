import java.util.Scanner;

public class IT24100476Lab7Q1B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

           //Creating a for loop for get 3 students subject marks
           for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            
            // Get marks for 4 subjects 
            System.out.print("Enter marks: ");
            int mark1 = input.nextInt();
            int mark2 = input.nextInt();
            int mark3 = input.nextInt();
            int mark4 = input.nextInt();

            // Calculate the average
            double average = ((double)mark1 + (double)mark2 + (double)mark3 + (double)mark4) / 4.0;
            System.out.println("Average is : "+ average);

            // Check conditions
            String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }

        
    }
}
