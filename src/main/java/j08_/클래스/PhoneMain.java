package j08_.클래스;

public class PhoneMain {

    public static void main(String[] args) {

        Phone iPhone14 = new Phone(); // new가 붙으면 메모리 할당
//        Phone galaxyS22 = new Phone(); // 메소드 호출
        Phone galaxyS22 = new Phone("SAMSUNG", "GalaxyS22");
        System.out.println(iPhone14);
        System.out.println(galaxyS22);

        iPhone14.company = "Apple"; // . <- 주소 참조 뜻
        galaxyS22.company = "SAMSUNG";

        iPhone14.printPhoneCompany();
        iPhone14.printPhoneModel();

        galaxyS22.printPhoneCompany();
        galaxyS22.printPhoneModel();

    }
}
