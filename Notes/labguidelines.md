Lab Guidelines
===================

##Getting Started
Begin work on your assignments by first cloning the Github repository that the instructor has created for you. The name of the repository will be `<username>-labs`, for example `srollins-labs`. You must work from this starting point, and submit your code to the same repository. More detail is available here: [Environment setup](environment.md)

##Lab Deadlines
This course uses a *mastery learning* approach, which means that an assignment must be resubmitted until it demonstrates mastery. Your final grade will depend on the number of assignments you complete. Beware that failure to make timely progress will likely result in a low or failing grade in the course as you will not have time to complete a sufficient number of assignments to pass the course.

###Requirements

1. You will have a total of **five** laboratory assignments.
2. Each lab will be worth **5%** of your final course grade.
3. You may not submit more than **one** lab per week. 
4. The *drop dead* deadline for labs is  **Friday, October 23, 2015**. No lab submissions will be accepted after this date. 
5. Any incomplete labs will receive a grade of 0.

Keep in mind that the requirements indicate that if you have not demonstrated mastery of Lab 1 by September 25 then you are guaranteed to receive a 0 on Lab 5.

##Submission

###Overview
The basic submission process is as follows:

1. Student verifies that assignment is passing all unit tests provided. Unit tests may not be required for all assignments.
2. Student creates a new release on github.
3. Instructor verifies test cases are passing.
4. Instructor *may* open github issues or make comments inline in Java code. If so, student repeats steps 1-3.
5. Once all tests cases are passing and code passes initial instructor review, student receives a Slack message with a link to sign up for code review. In exceptional cases, the instructor may allow a student to be exempt from a particular code review.
6. Student and instructor meet for code review session. Failure to attend a scheduled code review may result in a deduction on the assignment.
7. Instructor provides comments and *may* require student to repeat steps 1-6. 
8. Once all tests cases pass and instructor is satisfied with code quality, student may move on to next assignment. In most cases, the student will receive 100% upon demonstrating mastery, however the instructor retains the right to apply deductions as described below.

Follow the [instructions for using Github](environment.md) to make sure you have uploaded your code correctly.

Use the Github website to make sure you see the latest version of your code there.

Create a new release of your project as described in the [instructions for using Github](githubinstructions.md#submission). Once you complete this step, the instructor will receive an email triggering the verification process. 

:warning:  Do not create a release until you are passing all tests and believe you are prepared for a code review. You may always seek early feedback on your code by visiting office hours. 

##Testing
You should perform your own testing while you develop the lab. The code provided only tests your final result, and may not be suitable for testing your lab during development. To see which test files are relevant for each lab, look at the test suites provided in the `Lab#Test.java` files. 

###Running JUnit Tests Locally
If your Eclipse project is properly setup, you should be able to right-click the appropriate test file and select `Run As > JUnit Test` in the Package Explorer.

##Code Review

Once the instructor verifies your code passes all tests and meets a minimum criteria for review, you will receive a link to sign up for a code review. Each code review is 20 minutes, and will be held in the instructor's office. 

:memo: You can see all of the issues that you have created or have been assigned in the [Issues Dashboard](https://github.com/dashboard/issues/) on GitHub.

**:warning: If you sign up for code review but you are not passing the appropriate tests, your project score will be deducted 5 points.**

#### Code Review Process ####

During the code review, the instructor will discuss your code design with you and make suggestions for improvement. These will be provided either as `// TODO` comments directly in your code or as open "Issues" in GitHub. *You may remove these comments and close the issues after addressing them.*

After the review, your project will be given a `PASS`, `WARN`, or `FAIL` status:

- The `PASS` status signifies you passed the code review and may move on to the next project. Congratulations!

- The `WARN` status signifies you passed the code review and may move on to the next project, but must address some lingering issues before submitting the next project.

- The `FAIL` status signifies you did not pass the code review, and must resubmit. The resubmission process is outlined below.

  **:persevere: Do not fret!** This is expected to happen at least once per assignment. If you can pass the first code review, then you may not be in the right class!

:hourglass: Each code review is 20 minutes. If we do not have a chance to review your entire assignment within this time frame, it is likely you will need another code review. As such, make sure you address any easy fixes such as proper formatting and commenting **prior** to the code review to avoid wasting time.

:warning: Remember to [pull any changes](https://help.github.com/articles/fetching-a-remote#pull) made during code review to your local repository! Otherwise, you will end up with [merge conflicts](https://help.github.com/articles/resolving-a-merge-conflict-from-the-command-line) that may be difficult to resolve.

#### Resubmission Process ####

Everyone is expected to resubmit each assignment 1 to 3 times after their first code review, depending on the assignment. To resubmit your assignment:

1. Make sure you have addressed *all* of the issues opened by the instructor during the last code review. (You may close issues as you address them.)

2. Make sure you have updated your repository on GitHub.

3. Make sure you are still passing all tests.

4. Sign up for another code review appointment using the process outlined above.

:memo: For the most part, resubmissions will not negatively impact your grade. However, if you ignore an open issue or sign up for code review before you are passing the necessary tests, your final score will be docked 5 points for each offense.
