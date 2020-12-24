package Main;

import School.Class;
import School.Student;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students= createStudent(2);
        System.out.println(Arrays.toString(students));
    }
    private static Student[] createStudent(int n){
        Student[] students = new Student[n];
        for (int i = 1 ; i < n+1 ; i++){
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
            System.out.println("First name is " + student.getFirstName() + ". Last name is " + student.getLastName() +
                               ". Student's age is " +student.getAge() + ". Student's number is " +Main.createStudentNumber(student));
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
    private static Class[] createClass(int n){
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
