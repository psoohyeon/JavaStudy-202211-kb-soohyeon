package j04_입력;

import java.util.Scanner;

public class Input1 {

    public static void main(String[] args) {

        String name = null;
        int age = 0;
        String phone = null;
        String address = null;


        Scanner scanner = new Scanner(System.in);

        name = scanner.nextLine();
        age = scanner.nextInt();
        scanner.nextLine(); // <- 다음에 nextLine 붙으면 무조건 적기
        phone = scanner.nextLine();
        address = scanner.nextLine();

        //.next() .nextLine() 의 차이는 여백(스페이스바, 엔터)의 인식차이
        //nextLine()만 띄워쓰기인식
        //버퍼 : 데이터를 한 곳에서 다른 한 곳으로 전송하는 동안 일시적으로 그 데이터를 보관하는 메모리의 영역

//  변수 " 안적어도 됨
        System.out.println("이름: "+ name);
        System.out.println("나이: " + age);
        System.out.println("연락처: " + phone);
        System.out.println("주소: " + address);




    }
}
