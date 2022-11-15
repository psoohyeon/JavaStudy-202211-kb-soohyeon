package j02_변수;

/**
 * 클래스에 대한 설면
 */
public class Variable {

    public static void main(String[] args){

        /**
         * 메소드에 대한 설명
         */


        boolean checkFlag = false;  // true 또는 false 값이 들어갈 수 있다
        System.out.println("논리자료형 : " + checkFlag);
        checkFlag = true;
        System.out.println("논리자료형 : " + checkFlag);

        char name1 = '박';
        char name2 = '수';
        System.out.println("" + name1 + name2);
        System.out.println(name1);
        System.out.println(Integer.toHexString(name1));
        System.out.println("\uae40");


        int width = 100;
        int width2 = 200;

        System.out.println(width + width2); // int 는 덧셈연산 가능하다
        String sWidth = "100";
        String sWidth2 = "200";

        System.out.println(sWidth + sWidth2);   // 문자열은 수 연산이 되지 않는다

        double dNum = 2.1;
        double dNum2 = 3.5;
        System.out.println(dNum + dNum2);

        System.out.println("<<<< 형변환 >>>>");

        // 주석(메모)
        /*
          */

        // 업캐스팅
        // 문자 -> 정수 -> 실수
        char c1 = 'a';
        System.out.println(c1);
        System.out.println(((int) c1) + 10);
        int n1 = (int) c1;
        System.out.println(n1);
        double d1 = (double) n1;
        System.out.println(d1);

        // 다운캐스팅
        // 실수 -> 정수 -> 문자
        int n2 = (int) d1;
        System.out.println(n2);

        char c2 = (char) n2;
        System.out.println(c2);

    }
}
