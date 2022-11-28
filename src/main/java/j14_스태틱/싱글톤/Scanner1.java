package j14_스태틱.싱글톤;

import java.util.Scanner;

public class Scanner1 {

    public void inputName() {
        String name = null;
        Scanner scanner = ScannerSingleton.getInstance().getScanner();
//        getInstance() 스태틱메소드

        System.out.println("이름을 입력하세요 : ");
        name = scanner.nextLine();

        System.out.println("이름 : " + name);
    }
}
