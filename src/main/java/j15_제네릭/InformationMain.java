package j15_제네릭;

public class InformationMain {

    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(2022001)
                .name("박땡땡")
                .build();

        Teacher teacher = Teacher.builder()
                .teacherCode(200)
                .name("김땡땡")
                .build();

        Information<Student> studentInformation
                = new Information<Student>(student);

        Information<Teacher> teacherInformation
                = new Information<Teacher>(teacher);

        Information2 i1 = new Information2(student);
        Information2 i2 = new Information2(teacher);


        studentInformation.printInfo();
        teacherInformation.printInfo();

        System.out.println("학생 이름 : " + studentInformation.getTarget().getName());
        System.out.println("학생 이름2 : " + ((Student) i1.getTarget()).getName());

    }
}
