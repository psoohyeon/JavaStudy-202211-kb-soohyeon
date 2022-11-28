package j12_추상.추상클래스;

import java.util.Scanner;

public class AnimalMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Animal animal = null;   // null << 주소가 비었다 (자료형이 클래스인 변수에 사용!!) 참조 자료형

        while(true) {
            String select = null;

            System.out.println("1. 사람");
            System.out.println("2. 호랑이");
            System.out.println("q. 종료");

            System.out.println("동물을 선택하세요 ");
            select = sc.nextLine();

            if (select.equals("1")) {
                animal = new Human("사람");   // 1인 경우 animal = Human을 할거임
            } else if (select.equals("2")) {
                animal = new Tiger("호랑이");

            } else if (select.equals("q")) {
                break;
            } else {
                System.out.println("다시 입력하세요");
            }
            if (select.equals("1") || select.equals("2")) {
                animal.move();  // animal >> . << 공통적인 조건! 사람, 호랑이
                //animal 클래스에 move가 있어서 사용가능!!
            }
            System.out.println();
        }
    }
}










