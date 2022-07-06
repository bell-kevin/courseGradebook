# courseGradebook
Create a project that simulates a grade book for a class. Use a 2D array of integers, one row for each student, one column for each test score for that student. Set up the program for any number of students and any number of tests, and ask the user for those numbers. Test the program with 3 students that each have 3 test scores.  The CourseGrades application should use a GradeBook class that has instance variables for the number of students and the number of grades, and the 2D array to contain those values. The constructor will use parameters for the number of students and the number of tests to instantiate the 2D array of the proper size. Use these methods:         getGrades() to prompt the user for the test grades for each student        showGrades() to display the grades for the class        studentAvg() to display the average of the test scores for a specific student        testAvg() to display the average of the scores for all students for a specific test  Each of those methods does its own work to request the user input about specific data and for printing to the screen.  The driver class asks the user for the number of students and number of tests and passes that to the constructor to create the gradebook. The driver class needs to ask the user for the next action – show all grades, show the average for a specific student, show the average for a specific test, or exit the program. This needs to loop so the user can continue to interact with the program as often as they wish. Be sure to validate the input.  Remember that arrays begin in position 0. Be sure to compensate so that when displaying information about the first student or test, you display “1”, not “0”. When asking the user to select a student or test, the user will input the human-friendly value of 1, 2, or 3 – be sure to compensate for the computer’s version of 0, 1, or 2. It’s very important that the user doesn’t have to know that computers start counting at 0 – keep your on-screen interactions human-friendly. Take a screenshot of your program execution that matches this sample session. Then run it again with a different set of test scores for the students, and check that you get good results for every student’s average and every test’s average. Take a screenshot of that execution.


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
