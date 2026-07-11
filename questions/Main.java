/*import java.util.Scanner;
public class chal52courseclass {
    static int maxcapacity;
    int enrolledstudents;
    String coursename;
    boolean isenrolled;
    public chal52courseclass(int enrolledstudents, String coursename) {
        this.enrolledstudents = enrolledstudents;
        this.coursename = coursename;
    }
    @Override
    public String toString() {
        return "chal52courseclass [enrolledstudents=" + enrolledstudents + ", coursename=" + coursename + "]";
    }

    public static void setMaxCapacity(int Capacity){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the course name:");
        String coursename = sc.nextLine();
        System.out.println("enter the student limit:");
        int maxcapacity = sc.nextInt();

    }

    public void enrollStudents(String StudentName){
       while(enrolledstudents<=maxcapacity){
         if(isenrolled){
            System.out.println("student is allready enrolled");
        }else{
            this.isenrolled = true;
            enrolledstudents++;
        }
       }

    }
    public void unenrolledStudents(String studentName){
        if (isenrolled){
            this.isenrolled = false;
            System.out.println("you are unenrolled");
            enrolledstudents--;
        }else{
            System.out.println("bro enroll to karo pehle");
        }
     } 
    

}*/
// code without mistakes
import java.util.Scanner;

class Course {

    /*
     * =========================
     * STATIC VARIABLE
     * =========================
     *
     * static means:
     * this variable belongs to the CLASS,
     * not individual objects.
     *
     * So all Course objects share ONE common maxCapacity.
     *
     * GOOD THING YOU DID:
     * -------------------
     * You correctly understood that maxCapacity
     * should be static.
     */
    static int maxCapacity = 100;

    /*
     * =========================
     * INSTANCE VARIABLES
     * =========================
     *
     * Every course object has its own:
     * - courseName
     * - enrollments
     * - student list
     */
    String courseName;
    int enrollments;

    /*
     * YOUR MISTAKE:
     * -------------
     * You used:
     *
     * boolean isenrolled;
     *
     * Problem:
     * --------
     * A course can contain MANY students.
     *
     * But one boolean can only store:
     * true or false.
     *
     * That means your course was behaving like:
     * "only one student can exist in entire course"
     *
     * Example:
     * --------
     * If Lokesh enrolls:
     * isenrolled = true
     *
     * Then Rahul tries enrolling:
     * your code says already enrolled
     *
     * EVEN THOUGH Rahul is different student.
     *
     * CORRECT APPROACH:
     * -----------------
     * Store ALL student names using array/list.
     */
    String[] enrolledStudents;

    /*
     * =========================
     * CONSTRUCTOR
     * =========================
     */
    Course(String courseName) {

        /*
         * GOOD THING YOU DID:
         * -------------------
         * You correctly used:
         *
         * this.variable
         *
         * which refers to instance variables.
         */
        this.courseName = courseName;

        /*
         * Initially no students enrolled.
         */
        this.enrollments = 0;

        /*
         * Create array to store students.
         */
        enrolledStudents = new String[maxCapacity];
    }

    /*
     * =========================
     * STATIC METHOD
     * =========================
     */
    static void setMaxCapacity(int capacity) {

        /*
         * YOUR MISTAKE:
         * -------------
         * In your code:
         *
         * Scanner sc = new Scanner(System.in);
         *
         * inside this method.
         *
         * Problem:
         * --------
         * The question already gave:
         *
         * setMaxCapacity(int capacity)
         *
         * Meaning:
         * this method should RECEIVE the value
         * as parameter.
         *
         * Method's job should ONLY be:
         * setting max capacity.
         *
         * NOT taking user input.
         *
         * User input should usually happen in main().
         */

        /*
         * YOUR SECOND MISTAKE:
         * --------------------
         * You wrote:
         *
         * int maxcapacity = sc.nextInt();
         *
         * This creates a NEW LOCAL VARIABLE.
         *
         * It DOES NOT change static variable.
         *
         * This is called VARIABLE SHADOWING.
         *
         * Example:
         *
         * static int x = 10;
         *
         * void test() {
         *     int x = 5;
         * }
         *
         * The x inside method is DIFFERENT from class x.
         */

        /*
         * CORRECT WAY:
         */
        Course.maxCapacity = capacity;
    }

    /*
     * =========================
     * ENROLL METHOD
     * =========================
     */
    void enrollStudent(String studentName) {

        /*
         * YOUR MISTAKE:
         * -------------
         * You used:
         *
         * while(enrolledstudents <= maxcapacity)
         *
         * Problem:
         * --------
         * This can create INFINITE LOOP.
         *
         * Example:
         *
         * if isenrolled == true
         *
         * then inside loop:
         * you print "already enrolled"
         *
         * BUT:
         * enrolledstudents never changes
         *
         * so condition stays true forever.
         *
         * Infinite loop happens.
         *
         * IMPORTANT:
         * ----------
         * while loop should be used when:
         * condition changes eventually.
         *
         * Here we only need IF condition.
         */

        /*
         * Capacity check.
         *
         * YOUR SIR'S MISTAKE:
         * -------------------
         * Sir's code directly inserted student
         * into array without checking capacity.
         *
         * That can cause:
         * ArrayIndexOutOfBoundsException
         */
        if (enrollments >= maxCapacity) {
            System.out.println("Course is full.");
            return;
        }

        /*
         * GOOD THINKING FROM YOUR SIDE:
         * -----------------------------
         * You tried preventing duplicate enrollment.
         *
         * That is actually good logic thinking.
         *
         * BUT:
         * implementation using one boolean
         * was incorrect.
         *
         * CORRECT WAY:
         * search through student array.
         */
        for (int i = 0; i < enrollments; i++) {

            /*
             * IMPORTANT:
             * ----------
             * Use .equals() for String comparison.
             *
             * NEVER use == for String contents.
             */
            if (enrolledStudents[i].equals(studentName)) {

                System.out.println(studentName +
                        " is already enrolled.");

                return;
            }
        }

        /*
         * Add student.
         */
        enrolledStudents[enrollments] = studentName;

        /*
         * Increase count.
         */
        enrollments++;

        System.out.println(studentName +
                " enrolled successfully.");
    }

    /*
     * =========================
     * UNENROLL METHOD
     * =========================
     */
    void unenrollStudent(String studentName) {

        /*
         * YOUR SIR'S MISTAKE:
         * -------------------
         * Sir only did:
         *
         * enrollments--;
         *
         * Problem:
         * --------
         * Student was never actually removed.
         *
         * Example:
         * --------
         * [Lokesh, Rahul, Priya]
         *
         * If enrollments becomes 2,
         * Rahul may still exist inside array.
         *
         * So we must:
         * 1. search student
         * 2. remove properly
         */

        int index = -1;

        /*
         * Search student.
         */
        for (int i = 0; i < enrollments; i++) {

            if (enrolledStudents[i].equals(studentName)) {
                index = i;
                break;
            }
        }

        /*
         * Student not found.
         */
        if (index == -1) {

            System.out.println(studentName +
                    " is not enrolled.");

            return;
        }

        /*
         * SHIFTING LOGIC
         * --------------
         *
         * Example:
         *
         * Before removal:
         * [Lokesh, Rahul, Priya]
         *
         * Remove Rahul.
         *
         * After shifting:
         * [Lokesh, Priya, null]
         */
        for (int i = index; i < enrollments - 1; i++) {

            enrolledStudents[i] =
                    enrolledStudents[i + 1];
        }

        /*
         * Remove duplicate last value.
         */
        enrolledStudents[enrollments - 1] = null;

        /*
         * Reduce enrollment count.
         */
        enrollments--;

        System.out.println(studentName +
                " unenrolled successfully.");
    }

    /*
     * =========================
     * DISPLAY METHOD
     * =========================
     *
     * Extra helper method.
     */
    void displayStudents() {

        System.out.println("\nCourse Name: " + courseName);

        System.out.println("Enrolled Students:");

        if (enrollments == 0) {

            System.out.println("No students enrolled.");
            return;
        }

        for (int i = 0; i < enrollments; i++) {

            System.out.println((i + 1)
                    + ". "
                    + enrolledStudents[i]);
        }
    }

    /*
     * =========================
     * toString()
     * =========================
     *
     * GOOD THING YOU DID:
     * -------------------
     * You used toString().
     *
     * This is proper OOP practice.
     *
     * It helps print objects nicely.
     */
    @Override
    public String toString() {

        return "Course Name: " + courseName
                + "\nEnrollments: " + enrollments
                + "\nMax Capacity: " + maxCapacity;
    }
}

/*
 * =========================
 * DRIVER CLASS
 * =========================
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * Set common capacity.
         */
        Course.setMaxCapacity(3);

        /*
         * Create object.
         */
        Course javaCourse =
                new Course("Java Programming");

        /*
         * Enroll students.
         */
        javaCourse.enrollStudent("Lokesh");
        javaCourse.enrollStudent("Rahul");
        javaCourse.enrollStudent("Priya");

        /*
         * Duplicate test.
         */
        javaCourse.enrollStudent("Rahul");

        /*
         * Capacity test.
         */
        javaCourse.enrollStudent("Aman");

        /*
         * Print object.
         */
        System.out.println("\n" + javaCourse);

        /*
         * Display students.
         */
        javaCourse.displayStudents();

        /*
         * Remove student.
         */
        System.out.println();

        javaCourse.unenrollStudent("Rahul");

        /*
         * Show final list.
         */
        javaCourse.displayStudents();

        sc.close();
    }
}
```



