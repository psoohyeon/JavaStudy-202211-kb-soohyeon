package j06_반복;

import java.util.Scanner;

public class Loop6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String select = null;

        boolean loopFlag1 = true;
        boolean loopFlag2 = true;

        while (loopFlag1) { //while문 안에 break는 한 번만 걸 수 있다.

            System.out.println("[폴더 선택]");
            System.out.println("1. 문서");
            System.out.println("2. 음악");
            System.out.println("3. 사진");
            System.out.println("4. 동영상");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 : ");

            select = scanner.nextLine();

            if (select.equals("1")) {
                while (loopFlag2) {
                    System.out.println("[1. 문서]");
                    System.out.println("1. 대학서류");
                    System.out.println("2. 개인자료");
                    System.out.println("3. 기업정보");
                    System.out.println("b. 뒤로가기");
                    System.out.println("q. 프로그램 종료");
                    System.out.print("메뉴 선택 : ");
                    select = scanner.nextLine();

                    if (select.equals("1")) {

                    } else if (select.equals("2")) { //equals = 객체끼리 내용 비교

                    } else if (select.equals("3")) {

                    } else if (select.equals("b")) {
                        break;
                    } else if (select.equals("q")) { //파일 안에서 파일 전체종료를 하기 위해서 선언
                        System.out.print("정말 프로그램을 종료하시겠습니까?(y/n)");
                        select = scanner.nextLine();
                        if (select.equals("y")) {
                            loopFlag1 = false; // 내부 외부 두개의 while 모두종료
                            loopFlag2 = false;
                            //두 개의 while문을 전부 flase를 선언해주면 break 기능을 하게된다.
                        }
                    } else {
                        System.out.println("다시 입력하세요.");
                    }
                }
            } else if (select.equals("2")) {

            } else if (select.equals("3")) {

            } else if (select.equals("4")) {

            } else if (select.equals("q")) {
                System.out.print("정말 프로그램을 종료하시겠습니까?(y/n))");
                select = scanner.nextLine();
                if (select.equals("y")) {
                    break;
                }
            } else {
                System.out.println("다시 입력하세요.");
            }
        }
    }
}
