package j10_배열;

public class StudentMain {

    public static void main(String[] args) {

        Student[] students = new Student[3];
        // 배열 자료형

        students[0] = new Student("박땡떙", 1);
        students[1] = new Student("이땡떙", 2);
        students[2] = new Student("김땡떙", 3);

        for (int i = 0; i < students.length; i++){
            System.out.println("이름 : " + students[i].getName() + ", 학년 : " + students[i].getYear());
        }

    }
}
