package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main3 {
	
	public static void forEachTeast(Consumer<String> consumer, List<String> list) {
		for(String s : list) {
			consumer.accept(s);
		}
	}
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("임지현");
		names.add("신경수");
		names.add("고희주");
		names.add("문승주");
		names.add("장건녕");
		
		names.forEach(n -> { System.out.println(n);}); 
		//forEach 메소드 / (Consumer<? super T> action) Consumer 객체를 생성해서 업캐스팅
		
		/*
		 * 람다를 이용한 컬렉션 순회
		 * List<> 인터페이스에 추가된 forEach() 메소드를 이용하면 리스트 컬렉션에 들어있는
		 * 각 names들의 내용을 입력받은 람다식을 수행
		 * 리스트의 각 names를 순화하면서 출력을 호출하는 코드가 광장히 간다해짐
		 * forEach 함수에서 람다식을 생략해도 List에 들어있는 모든 값이 출력
		 */
		names.forEach(System.out::println); //메소드 레퍼런스
		
		System.out.println();
		forEachTeast(n -> {System.out.println(n);}, names); 
		// n -> {System.out.println(n);} Consumer 객체
		
	}

}
