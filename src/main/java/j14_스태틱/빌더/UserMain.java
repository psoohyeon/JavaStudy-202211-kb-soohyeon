package j14_스태틱.빌더;

public class UserMain {

    public static void main(String[] args) {
        User user = User.builder()
                .username("soohyeon")
                .password("1234")
                .email("abcd@kakao.com")
                .name("박땡땡")
                .build();

        System.out.println(user);

    }



}
