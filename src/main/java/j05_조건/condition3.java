package j05_조건;

import java.util.Scanner;

public class condition3 {

    public static void main(String[] args) {


        String select = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("선택: ");
        select = scanner.nextLine();

        switch (select) { // switch-> select값을 찾아감
            case "아침":
                System.out.println("아침 식사");
                break;
            case "점심":
                System.out.println("점심 식사");
            case "저녁":
                System.out.println("저녁 식사");
            default:
                System.out.println("잘못된 입력입니다.");


        }


    }
}
