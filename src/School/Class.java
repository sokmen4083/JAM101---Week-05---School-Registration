package School;


public class Class {
    private String gradeOfClass;
    private Student [] students = new Student[2];

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    public String getGradeOfClass() {
        return gradeOfClass;
    }

    public void setGradeOfClass(String gradeOfClass) {
        this.gradeOfClass = gradeOfClass;
    }

}
