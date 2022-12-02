package j16_컬렉션.user;

import java.util.List;
import java.util.Map;

import javax.annotation.processing.Generated;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor

public class UserRepository {

	@Getter
	private List<Map<String, Object>> userList;

	// Create
	public void register(Map<String, Object> userMap) {
		System.out.println("[사용자 등록]");
		userList.add(userMap);

	}

	// Read
	public Map<String, Object> findUserByUsername(String username) {
		Map<String, Object> userMap = null;

		for (Map<String, Object> user : userList) {
			String _username = (String) user.get("username");
			if (_username.equals(_username)) {
				userMap = user;
				break;
			}
		}
		return userMap;

	}

	public void modifyPasswordByUsername(String username, String newPassword) {
		Map<String, Object> userMap = findUserByUsername(username);
		if (userMap == null) {
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return; // 메소드 강제로 빠져나가기
		}

		userMap.replace("password", newPassword);

	}

	public void deleteUserByUsername(String username) {
		Map<String, Object> userMap = findUserByUsername(username);

		if (userMap == null) {
			System.out.println("해당 username으로 사용자를 찾을 수 없습니다.");
			return;
		}
		int userIndex = userList.indexOf(userMap);
		userList.remove(userIndex);

	}
}
