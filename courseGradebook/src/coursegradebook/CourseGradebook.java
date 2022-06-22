/** ****************************************************************************
 * CourseGradebook.java
 * Kevin Bell
 *
 * This program simulates a grade book for a class
 **************************************************************************** */
package coursegradebook;

import java.util.Scanner;

public class CourseGradebook {

    public static void main(String[] args) {
        //declarations
        Scanner computerKeyboardInput = new Scanner(System.in);
        int numberTests, numberStudents, select; //user choice for next action
        GradeBook gradeBookMath;
        //preparatory input
        System.out.println("Ch 9 Course Grades by Kevin Bell\n");
        System.out.print("How many students in the class? ");
        numberStudents = computerKeyboardInput.nextInt();
        System.out.print("How many tests in the course? ");
        numberTests = computerKeyboardInput.nextInt();
        computerKeyboardInput.nextLine(); //flush newline
        //set up gradebook, enter grades, and display all grades
        gradeBookMath = new GradeBook(numberStudents, numberTests);
        gradeBookMath.getGrades();
        gradeBookMath.showGrades();
        //menu loop for next action
        do {
            System.out.println("\nEnter 1 (show all grades), "
                    + "2 (a student's average), 3 (a test average),"
                    + " or 4 (quit)");
            System.out.print("Enter your selection: ");
            select = computerKeyboardInput.nextInt();
            switch (select) {
                case 1:
                    gradeBookMath.showGrades();
                    break;
                case 2:
                    gradeBookMath.studentAverage();
                    break;
                case 3:
                    gradeBookMath.testAverage();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid input");
            } //end switch
        } while (select != 4);
    } //end main   
} //end class CourseGrades
