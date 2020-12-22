package School;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String studentNumber;

    public Student(){

    }

    public Student(String firstName, String lastName, int age, String studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}