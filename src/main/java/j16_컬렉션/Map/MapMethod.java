package j16_컬렉션.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapMethod {
	
	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("username", "junil");
		map.put("password", "1234");
		map.put("name", "김준일");
		map.put("email", "hydmeofk@naver.com");
		map.put("age", 29);
		map.put("gender", true);
		
		Map<String, String> address = new HashMap<>(); 
		address.put("address1", "부산광역시");
		address.put("address2", "동래구");
		address.put("address3", "중앙대로 1285");
		
		map.put("address", address);
		
		Map<Integer, String> subject = new TreeMap<>();
		subject.put(100, "java");
		subject.put(200, "C++");
		subject.put(300, "python");
		subject.put(401, "python2");
		subject.put(403, "python3");
		subject.put(502, "python4");
		subject.put(604, "python5");
		
		map.put("subject", subject);
		
		System.out.println(map);
		System.out.println(((Map<Integer, String>) map.get("subject")).get(300));
		
		List<String> hobby = new ArrayList<>();
		
		hobby.add("축구");
		hobby.add("농구");
		hobby.add("야구");
		hobby.add("족구");
		
		map.put("hobby", hobby);
		
		System.out.println(((List<String>) map.get("hobby")).get(2));
	
		Set<Entry<String, Object>> userEntry = map.entrySet(); // map을 entrySet형태로 바꿔라 
		// Entry는 Key, Value 한쌍으로 같이 나옴 
		// set,list -> {} map -> []
		
		List<Map<String, Object>> listMap = new ArrayList<>(); 
		
		Set<String> names = new HashSet<>(); // 순서, 중복 없음
		names.add("김준일");
		names.add("김준이");
		names.add("김준삼");
		names.add("김준사");
		names.add("김준오");
		
		
		for(String name : names) {
			System.out.println(name);
		}

		
		for(Entry<String, Object> entry : userEntry) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println();
		/*===================================================================*/
		
		Set<String> keys = map.keySet(); // key 값이 String 전부 String객체로 만들어준다
		for(String key : keys) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		System.out.println("=================================");
		System.out.println(map.values());
		
		for(Object obj : map.values()) { //컬렉션 객체
			System.out.println(obj);
			
		}
		
		
		

		
	}

}
