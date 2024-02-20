// Declare a class called student having following data members:id_no, no_of_subjects_registered, subject_code, 
//subject_credits, grade_obtained and spi. De ne constructor and calculate_spi methods.De ne main to instantiate an array 
//for objects of class student to process data of n students to be given as command line arguments.
import java.util.*;
class Student{
    double id_no;
    int no_of_subjects_registered;
    String subject_code[];
    int subject_credits[];
    String grade_obtained[];
    double spi;

    Student(double id_no, int no_of_subjects_registered) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = new String [this.no_of_subjects_registered];
        this.subject_credits = new int [this.no_of_subjects_registered];
        this.grade_obtained = new String[this.no_of_subjects_registered];
    }

    public 
}
public class Lab_6_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int student_no = Integer. parseInt(args[0]);
        Student [] stu = new Student[student_no];

        for(int i=0; i<student_no; i++) {
            System.out.println("Enter the id number of the student " + i +":");
            double id_no = sc.nextDouble();
            System.out.println("Enter the total subject registered of student" + i +":");
            int no_of_subjects_registered = sc.nextInt();
            stu [i] = new Student(id_no , no_of_subjects_registered);
            stu [i].getStudentDetails();
        }
    }
}