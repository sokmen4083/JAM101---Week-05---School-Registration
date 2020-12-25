package Main;

import School.Class;
import School.Student;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students = createStudent(2);
        Class[] classes = createClass();
        allOfStudents(students);
        addStudentsInSameArray(students, classes);
        for (Class curClass : classes){
            System.out.println(curClass.getGradeOfClass() + Arrays.toString(curClass.getStudents()));
        }
    }
    private static Student[] createStudent(int n){
        Student[] students = new Student[n];
        for (int i = 0 ; i < n ; i++){
            Student student = new Student();
            createName(student, i);
            createAge(student, i);
            student.setStudentNumber(createStudentNumber(student));
            students[i] = student;
        }
        return students;
    }
    private static String createStudentNumber(Student pStudent){
        String studentNumber;
        String twoLettersOfFirstName;
        int age = pStudent.getAge();
        String lastThreeLetterOfLastName;
        if (pStudent.getLastName().length() >= 3){
            twoLettersOfFirstName = pStudent.getFirstName().substring(0, 2).toUpperCase();
            lastThreeLetterOfLastName = pStudent.getLastName().substring(pStudent.getLastName().length() - 3).toUpperCase();
        }else{
            twoLettersOfFirstName = pStudent.getFirstName().substring(0, 2);
            lastThreeLetterOfLastName = pStudent.getLastName();
        }
        studentNumber = twoLettersOfFirstName + lastThreeLetterOfLastName + age;
        System.out.println(pStudent.getFirstName() + " " + pStudent.getLastName() + "'s number is " + studentNumber);
        return studentNumber;
    }
    private static void allOfStudents(Student[] pStudent){
        for(Student student:pStudent){
            char charFirstLetter = student.getFirstName().charAt(0);
            String firstLetter = Character.toString(charFirstLetter).toUpperCase();
            String viewOfRegistration = student.getStudentNumber() + ", " + firstLetter + student.getFirstName().substring(1) + " " + student.getLastName().toUpperCase();
            System.out.println(viewOfRegistration);
        }
    }
    private static void createName(Student pStudent, int pI){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + (pI+1) + ". student firstname: ");
        String firstName = scanner.nextLine();
        while (firstName.length() <= 0){
            System.out.println(" Please enter valid firstname!!!");
            firstName = scanner.nextLine();
        }
        pStudent.setFirstName(firstName);
        System.out.println("Enter " + (pI+1) + ". student lastname: ");
        String lastName = scanner.nextLine();
        while (lastName.length() <= 0){
            System.out.println(" Please enter valid lastname!!!");
            lastName = scanner.nextLine();
        }
        pStudent.setLastName(lastName);
    }
    private static void createAge(Student pStudent, int pI){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + (pI+1) + ". student age: ");
        int studentAge = scanner.nextInt();
        pStudent.setAge(studentAge);
        if(6 <= pStudent.getAge() && pStudent.getAge() <= 10){
        }else{
            System.out.println("Please enter a value between 6 and 10.  " + (pI+1) + ". student age: ");
            studentAge = scanner.nextInt();
        }
        pStudent.setAge(studentAge);
    }
    private static Class[] createClass(){
        Class[] school = new Class[5];
        for(int i = 0; i < 5 ; i++){
            Class newClass = new Class();
            newClass.setGradeOfClass("" + (i+1) + ". Grade");
            school[i] = newClass;
        }
        return school;
    }
    private static Student[] class1(Student[] pStudent){
        Student[] class1 = new Student[2];
        for (int index = 0; index < class1.length;index++){
            if (pStudent[index].getAge() == 6){
                class1[index]=pStudent[index];
            }else{
                return null;
            }
        }
        return class1;
    }
    private static Student[] class2(Student[] pStudent){
        Student[] class2 = new Student[2];
        for (int index = 0; index < class2.length;index++){
            if (pStudent[index].getAge() == 6){
                class2[index]=pStudent[index];
            }else{
                return null;
            }
        }
        return class2;
    }
    private static Student[] class3(Student[] pStudent){
        Student[] class3 = new Student[2];
        for (int index = 0; index < class3.length;index++){
            if (pStudent[index].getAge() == 6){
                class3[index]=pStudent[index];
            }else{
                return null;
            }
        }
        return class3;
    }
    private static Student[] class4(Student[] pStudent){
        Student[] class4 = new Student[2];
        for (int index = 0; index < class4.length;index++){
            if (pStudent[index].getAge() == 6){
                class4[index]=pStudent[index];
            }else{
                return null;
            }
        }
        return class4;
    }
    private static Student[] class5(Student[] pStudent){
        Student[] class5 = new Student[2];
        for (int index = 0; index < class5.length;index++){
            if (pStudent[index].getAge() == 6){
                class5[index]=pStudent[index];
            }else{
                return null;
            }
        }
        return class5;
    }
    private static void addStudentsInSameArray(Student[] pStudent, Class[] pClass){

    }
}