/** ****************************************************************************
 * GradeBook.java
 * Kevin Bell
 *
 * This class is associated with CourseGrades.java
 **************************************************************************** */
package coursegradebook;

import java.util.Scanner;

class GradeBook {

    //declarations
    Scanner computerKeyboardInput = new Scanner(System.in);
    int[][] gradeBook;

    public GradeBook(int numberStudents, int numberGrades) {
        gradeBook = new int[numberStudents + 1][numberGrades + 1];
        gradeBook[0][0] = numberStudents; //store total number students at 0,0
        gradeBook[0][1] = numberGrades; //store total number grades at 0,1
    } //end GradBook constructor

    public void getGrades() {
        for (int s = 1; s <= gradeBook[0][0]; s++) {
            for (int g = 1; g <= gradeBook[0][1]; g++) {
                System.out.printf("Enter %d's score on test %d: ",
                        (s), (g));
                gradeBook[s][g] = computerKeyboardInput.nextInt();
            } //end for
        } //end for
    } //end getGrades

    public void showGrades() {
        for (int s = 1; s <= gradeBook[0][0]; s++) {
            System.out.printf("%d's scores:  ", s);
            for (int g = 1; g <= gradeBook[0][1]; g++) {
                System.out.printf(" Test %d: %-3d", g, gradeBook[s][g]);
            } //end for
            System.out.println();
        } //end for
    } //end showGrades

    public void studentAverage() {
        int selectStudent;
        double average = 0;
        System.out.print("Which student's average do you want to see? ");
        selectStudent = computerKeyboardInput.nextInt();
        for (int g = 1; g <= gradeBook[0][1]; g++) {
            average += gradeBook[selectStudent][g];
        }
        System.out.printf("The average score for student %d is %-3.2f\n",
                selectStudent, (average / gradeBook[0][1]));
    } //end studentAverage

    public void testAverage() {
        int selectTest;
        double average = 0;
        System.out.print("Which test average do you want to see? ");
        selectTest = computerKeyboardInput.nextInt();
        for (int s = 1; s <= gradeBook[0][0]; s++) {
            average += gradeBook[s][selectTest];
        }
        System.out.printf("The average score for test %d is %-3.2f\n",
                selectTest, (average / gradeBook[0][0]));
    } //end testAverage 
} //end class GradeBook
