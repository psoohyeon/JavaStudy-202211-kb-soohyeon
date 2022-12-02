package j17_JSON;

import com.google.gson.annotations.Expose;

import lombok.Builder;
import lombok.Data;

/*
 * 
 * serialize (Object -> Json)
 * deserialize (Json -> Object)
 * 
 */

@Builder
@Data

public class User {
	@Expose(serialize = true, deserialize = true) // 기본값이 true로 안되어있어서 각각 적어주깅깅깅깅긔ㄱ
	private String username; 
	@Expose(serialize = false, deserialize = false)
	private String password;
	@Expose(serialize = true, deserialize = false)
	private String name;
	@Expose(serialize = true, deserialize = true)
	private String email;

	}
	
