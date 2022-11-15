package j03_연산자;

public class Operatoin2 {

    public static void main(String[] args) {

        int num = 10;
        num = num + 1;

        // ++num = +1
        // num++ = num 나오고 ++ 나중에 실행
       //        = 하나면 <- 계산 /
        num++;  // 이 자리에서는 1이 더해지지 않음 (다음 행)
        ++num;  // 이 자리에서 1이 더해짐

        System.out.println(num);
//        System.out.println(num++);  12 출력
//        System.out.println(++num);  13 출력


        System.out.println(num++);
        System.out.println(++num);
    }
}
