/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private List<String> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void enrollCourse(String courseName) {
        courses.add(courseName);
    }

    public void displayCourses() {
        System.out.println(name + "'s enrolled courses:");
        for (String course : courses) {
            System.out.println(course);
        }
    }
}

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
         System.out.println("Available Courses:");
            System.out.println("-Python");            
                        System.out.println("-Java");
                                    System.out.println("-C++");
            System.out.println("-DataScience");   
            System.out.println("-CyberSecurity");   

        while (true) {
              
            System.out.println("Read and select a choice for registering/checking out your courses:");            
            System.out.println("1. Register Student");
            System.out.println("2. Enroll Student in Course");
            System.out.println("3. Display Student Courses");
            System.out.println("4. Remove Course/Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scn.next();
                    System.out.print("Enter student ID: ");
                    int id = scn.nextInt();
                    students.add(new Student(name, id));
                    break;

                case 2:
                    System.out.print("Enter student ID: ");
                    int studentId = scn.nextInt();
                    Student student = findStudentById(students, studentId);
                    if (student != null) {
                        System.out.print("Enter course name: ");
                        String courseName = scn.next();
                        student.enrollCourse(courseName);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    int displayStudentId = scn.nextInt();
                    Student displayStudent = findStudentById(students, displayStudentId);
                    if (displayStudent != null) {
                        displayStudent.displayCourses();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter student ID: ");
                    displayStudentId = scn.nextInt();
                 
                     student = findStudentById(students, displayStudentId);
                    displayStudent = findStudentById(students, displayStudentId);
                    if (displayStudent != null) {
                        displayStudent.displayCourses();
                    } else {
                        System.out.println("Student not found.");
                    }
                    
                    System.out.println("Do you want to remove student/Course?(Reply 0 for student and 1 for couse)");
                    int reply=scn.nextInt();
                    if(reply==0)
                    {
                        displayStudent = findStudentById(null, 0);
                    }
                    else if(reply==0)
                    {  String courseName=null;
                        student.enrollCourse(courseName);
                    }
                    
                    
                    break;
                case 5:
                    System.out.println("Ok.Thank you...");
                    scn.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static Student findStudentById(List<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}
