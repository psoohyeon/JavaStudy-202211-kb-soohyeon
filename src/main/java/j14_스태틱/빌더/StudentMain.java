package j14_스태틱.빌더;

public class StudentMain {

    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(2022)
                .name("김땡땡")
                .address("부산 중구")
                .build();

        System.out.println(student);


    }
}
