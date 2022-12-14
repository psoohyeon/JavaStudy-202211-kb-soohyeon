package j07_메소드;

public class Calc {
    /*

    1. add(덧셈) -> return int, parameter int x, int y
    2. sub(뺄셈)
    3. mul(곱셈)
    4. div(나눗셈)
    5. mod(나머지)

     */

    public static int add(int x, int y) {
        return  x + y;
    } // 자료형인 경우 리턴이 있어야한다.
    public static int sub(int x, int y) {
        return  x - y;
    } // 메소드의 자료형과 리턴값의 자료형이 같아야 한다.
    public static int mul(int x, int y) {
        return  x * y;
    }
    public static int div(int x, int y) {
        return  x / y;
    }
    public static int mod(int x, int y) {
        return  x % y;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        int addResult = add(a,b);
        int subResult = sub(a,b);
        int mulResult = mul(a,b);
        int divResult = div(a,b);
        int modResult = mod(a,b);

        System.out.println("a + b = " + addResult);
        System.out.println("a - b = " + subResult);
        System.out.println("a * b = " + mulResult);
        System.out.println("a / b = " + divResult);
        System.out.println("a % b = " + modResult);
    }
}
//  재사용되는 로직을 묶어 놓는것을 메소드
