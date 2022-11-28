package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student {
    private int studentCode;
    private String name;
    private String address;
    //클래스 안에 클래스

    public static StudentBuilder builder() {
        return new StudentBuilder(); // StudentBuilder 생성해서 리턴 (user.builder)를 호출
    }

    public static class StudentBuilder {
        private int studentCode;
        private String name;
        private String address;

        public StudentBuilder studentCode(int studentCode) {
            this.studentCode = studentCode;
            return this; // 자기 자신 리턴

        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;

        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(studentCode, name, address);
        }
    }
}
