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
            if (student.getLastName().length() >= 3){
                String twoLettersOfFirstName = student.getFirstName().substring(0, 2);
                int age = student.getAge();
                String studentNumber = student.setStudentNumber();
                String lastThreeLetterOfLastName = student.getLastName().substring(student.getLastName().length()-3,student.getLastName().length());
                studentNumber = twoLettersOfFirstName + lastThreeLetterOfLastName + age;
                System.out.println(student.getFirstName() + " " + student.getLastName() + "'s number is " + studentNumber);
            }else if(student.getLastName().length() < 3){
                System.out.println(" Enter lastname greater than 3 letters.");
                System.out.println("Enter " + i + ". student lastname: ");
                student.setLastName(scanner.next());
                String twoLettersOfFirstName = student.getFirstName().substring(0, 2);
                int age = student.getAge();
                String studentNumber = student.setStudentNumber();
                String lastThreeLetterOfLastName = student.getLastName().substring(student.getLastName().length()-3,student.getLastName().length());
                studentNumber = twoLettersOfFirstName + lastThreeLetterOfLastName + age;
                System.out.println(student.getFirstName() + " " + student.getLastName() + "'s number is " + studentNumber);

            }
            students[i] = student;
        }
        return students;
    }
    private static Class[] addTheStudentsInClass(int n){
        Class[] students = new Class[n];
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i < n+1; i++){
           Student student = new Student();
           student.setFirstName(scanner.nextLine());
           student.setLastName(scanner.nextLine());
           student.setAge(scanner.nextInt());
       }
        return students;
    }
}
