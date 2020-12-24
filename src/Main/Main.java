package Main;

import School.Class;
import School.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = createStudent(2);
        Class[] classes = createClass(2,students);
        for (Student s :students) {
            System.out.println("Student's first name is " + s.getFirstName() + " Srudent's last name is " + s.getLastName()
            + " Student's age is " + s.getAge());
        }
    }
    private static Student[] createStudent(int n){
        Student[] students = new Student[n];
        for (int i = 0 ; i < n ; i++){
            Student student = new Student();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter " + i + ". student firstname: ");
            String firstName = scanner.nextLine();
            while (firstName.length() <= 0){
                System.out.println(" Please enter valid firstname!!!");
                firstName = scanner.nextLine();
            }
            student.setFirstName(firstName);
            System.out.println("Enter " + i + ". student lastname: ");
            String lastName = scanner.nextLine();
            while (lastName.length() <= 0){
                System.out.println(" Please enter valid lastname!!!");
                lastName = scanner.nextLine();
            }
            student.setLastName(lastName);
            System.out.println("Enter " + i + ". student age: ");
            student.setAge(scanner.nextInt());
            if(6 <= student.getAge() && student.getAge() <= 10){
            }else{
                System.out.println("Please enter a value between 6 and 10.  " + i + ". student age: ");
                student.setAge(scanner.nextInt());
            }
            student.setStudentNumber(createStudentNumber(student));
            students[i] = student;
        }
        return students;
    }
    private static String createStudentNumber(Student pStudent){
        String studentNumber = "";
        if (pStudent.getLastName().length() >= 3){
            String twoLettersOfFirstName = pStudent.getFirstName().substring(0, 2).toUpperCase();
            int age = pStudent.getAge();
            String lastThreeLetterOfLastName = pStudent.getLastName().substring(pStudent.getLastName().length()-3,pStudent.getLastName().length()).toUpperCase();
            studentNumber = twoLettersOfFirstName + lastThreeLetterOfLastName + age;
            System.out.println(pStudent.getFirstName() + " " + pStudent.getLastName() + "'s number is " + studentNumber);
        }else{
            String twoLettersOfFirstName = pStudent.getFirstName().substring(0, 2);
            int age = pStudent.getAge();
            String lastThreeLetterOfLastName = pStudent.getLastName().substring(0, pStudent.getLastName().length());
            studentNumber = twoLettersOfFirstName + lastThreeLetterOfLastName + age;
            System.out.println(pStudent.getFirstName() + " " + pStudent.getLastName() + "'s number is " + studentNumber);
        }
        return studentNumber;
    }
    private static void allOfStudents(Student[] pStudent){
        for(Student student:pStudent){
            System.out.println(student.getFirstName() + student.getLastName() +
                                student.getAge() + student.setStudentNumber());
        }
    }
    private static Class[] createClass(int n, Student[] students){
        Class[] classes = new Class[n];
        for(int i = 1; i < 6 ; i++){
            Class newClass = new Class();
            newClass.setGradeOfClass("" + i + ". Grade");
            classes[i] = newClass;
        }
        return classes;
    }
    private static void addStudentsInClass(){

    }
}
