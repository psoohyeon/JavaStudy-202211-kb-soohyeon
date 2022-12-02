package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.List;

public class StringList {

	public static void main(String[] args) {
		String[] strArray = new String[3];

		strArray[0] = "Java";
		strArray[1] = "Jap";
		strArray[2] = "Servlet";

		// 일반반복
		System.out.println("<<<<< 일반 반복 >>>>>");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[1]);
		}

		// foreach
		System.out.println("<<<<< foreach >>>>");
		for (String str : strArray) { // 데이터의 집합, 동일한 자료형이어야한다.
			System.out.println(str);
		}

		ArrayList<String> strList = new ArrayList<String>();
		// 값 추가 (Create) -> add(값), add(index, 값)
		strList.add("Java");
		strList.add("Jap");
		strList.add("Servlet");
		strList.add(1, "C++");
		strList.add(0, "HTML");

//        Vector<String> v = new Vector< 2 >;
//        v.addElement("test");
//        v.addElement("test");
//        v.addElement("test");
		System.out.println("<<<<< List foreach >>>>>");
		for (String str : strList) {
			System.out.println(str);
		}
//           값 조회(Read) -> get(index)
		System.out.println("<<<< List 일반반복 >>>>");
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		// 값 수정(Update) -> set(index, 값).
		System.out.println("<<<< List 수정 >>>>");
		strList.set(0, "HTML5");

		System.out.println(strList);

		// 값 삭제(Delete) -> remove(index)
		System.out.println("<<<< List 삭제 >>>>");
		String removeData = strList.remove(2);
		System.out.println(removeData);
		System.out.println(strList);

	}

	public static class StudentList {

		public static void main(String[] args) {

			List<Student> students = new ArrayList<Student>();

			students.add(new Student(20220001, "김땡땡", 21, null));
			students.add(new Student(20220002, "이땡땡", 22, null));
			students.add(new Student(20220003, "박땡땡", 23, null));
			students.add(new Student(20220004, "정땡땡", 24, null));
			students.add(new Student(20220005, "문땡땡", 25, null));

			Student student2 = students.get(3);

			System.out.println(student2);

			// 이름이 문경원인 학생의 나이를 26세로 바꾸세요?
		}
	}
}
