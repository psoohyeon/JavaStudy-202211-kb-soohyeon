package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();
		List<String> names = new ArrayList<String>();
		students.add(new Student(20220001, "이땡땡", 21, null));
		students.add(new Student(20220001, "김땡땡", 22, null));
		students.add(new Student(20220001, "문땡땡", 23, null));
		students.add(new Student(20220001, "홍땡땡", 24, null));
		students.add(new Student(20220001, "고땡땡", 25, null));

// 문땡땡인 학생의 나이를 26세로 바꾸세요.

		for (int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			if (s.getName().equals("문땡땡")) {
				s.setAge(26);
				break;
			}
		}
		System.out.println(students);

		// 0번 인덱스 학생의 이름을 다음 인덱스의 학생 이름으로 변경
		// 제일 마지막 인덱스의 학생 이름으로 0번 인덱스로 이동

		String lastName = null;
		for (int i = 0; i < students.size(); i++) {
			int nowIndex = students.size() - 1 - i; // 마지막
			int preIndex = nowIndex - 1; // 그 앞
			Student s = students.get(nowIndex);

			if (nowIndex == 0) {
				s.setName(lastName);
				break;
			}
			if (nowIndex == students.size() - 1) {
				lastName = s.getName();
			}
			s.setName(students.get(preIndex).getName());

			System.out.println(students);
		}
	}
}

//        names.add("이땡땡");
//        names.add("김땡땡");
//        names.add("문땡땡");
//        names.add("홍땡땡");
//        names.add("고땡땡");
//
//        for (int i = 0; i < students.size(); i++) {
//            if (i == 4) {
//                students.get(0).setName("고땡땡");
//                break;
//            }
//            students.get(i + 1).setName((names.get(i)));
//        }