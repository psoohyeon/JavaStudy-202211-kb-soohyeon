package j08_.클래스;

public class Phone {

    String company;
    String model;

    Phone() {

    }// 생성자
    // 반환 자료형이 없음, 클래스 명이 똑같음
    Phone(String c,String m){
        System.out.println("생성자 호출?");
        System.out.println();

    } // 생성자 오버 로딩

    void printPhoneCompany(){
        System.out.println("제조사: " + company);
        System.out.println();
    }
    void printPhoneModel(){
        System.out.println("제조사: " + model);
        System.out.println();
    }
}
// phone 이라는 자료형을 만듬

