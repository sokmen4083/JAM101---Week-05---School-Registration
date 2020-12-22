package Main;

import School.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = Main.createStudent(2);

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
            students[i] = student;
        }
        return students;
    }

}
