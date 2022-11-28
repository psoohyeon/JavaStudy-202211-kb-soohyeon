package j08_.클래스;

public class StudentMain {

    public static void main(String[] args) {

        Student student = new Student();
        Student student2 = new Student("땡땡대학교","박땡땡",3,false);

        student.school = "땡땡대학교";
        student.name = "박땡땡";
        student.studentYear = 3;
        student.school = "ture";

        student.showStudentInfo();
        student2.showStudentInfo();

    }
}

