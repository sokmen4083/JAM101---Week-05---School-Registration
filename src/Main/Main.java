package Main;

import School.School;
import School.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createStudent(2);
    }
    private static Student[] createStudent(int n){
        Student[] students = new Student[n];
        for (int i = 1 ; i < n+1 ; i++){
            Student student = new Student();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter " + i + ". student firstname: ");
            student.setFirstName(scanner.nextLine());
            System.out.println("Enter " + i + ". student lastname: ");
            student.setLastName(scanner.nextLine());
            System.out.println("Enter " + i + ". student age: ");
            student.setAge(scanner.nextInt());
            if(6 <= student.getAge() && student.getAge() <= 10){
            }else{
                System.out.println("Please enter a value between 6 and 10.  " + i + ". student age: ");
                student.setAge(scanner.nextInt());
            }
            String twoLettersOfFirstName = student.getFirstName().substring(0, 2);
            String lastThreeLetterOfLastName = student.getLastName().substring(students.length);
            int age = student.getAge();
            String studentNumber = student.setStudentNumber();
            studentNumber = twoLettersOfFirstName + lastThreeLetterOfLastName + age;
            System.out.println(i + ". student's number is " + studentNumber);
            students[i] = student;
        }
        return students;
    }

}
