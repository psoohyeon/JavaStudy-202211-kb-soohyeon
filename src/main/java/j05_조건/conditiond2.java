package j05_조건;

 import java.util.Scanner;


public class conditiond2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;

        System.out.println("점수를 입력하세요. ");
        score = scanner.nextInt();

            // if(score > 89 && score < 101

        if(score < 0 || score > 100) {
            System.out.println("잘못된 점수입니다.");
        } else if(score > 89) {
            System.out.println("A학점");
        } else if(score > 79) {
            System.out.println("B학점");
        } else if(score > 69) {
            System.out.println("C학점");
        } else if(score > 59) {
            System.out.println("D학점");
        } else {
            System.out.println("F학점");
        }

            /*
             점수가 0보다 작거나(OR) 100보다 크면 잘못된 점수 입니다. 출력하기
            90 ~ 100 A학점 출력
            80 ~ 89  B학점 출력
            70 ~ 79  C학점 출력
            60 ~ 69  D학점 출력
            0 ~ 59 F학점 출력
            Ctrl + D 라인복사
         */



    }
}

