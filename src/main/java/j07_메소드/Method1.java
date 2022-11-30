package j07_메소드;

public class Method1 {

    public static void method1() {//void 값이 없다

        System.out.println("메소드1 호출");
        System.out.println();
        method2(100);
    }

    public static void method2(int a) {
        System.out.println("메소드2 호출");
        System.out.println("매개변수 a : " + a);
        System.out.println();
    }
    // 반환값이 int형인 메소드3
    public static int method3(int a, int b){
        System.out.println("메소드2 호출");
        System.out.println("매개변수 a : " + a);
        System.out.println("매개변수 b : " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println();
        return a + b;
    }

    public static int max(int a, int b) {
//      int result = 0;
//        if(a < b) {
//            result = b;
//        } else {
//            result = a;
//        return result;


        if(a < b) {
            return b;
        } else {
            return a; // return을 만나면 메소드 끝남
        }
    }

    public static void main(String[] args) {
        method1();
        System.out.println("메소드1 호출 후 출력");
        method2(10); // int a로 들어감
        int result1 = method3(3000, 7000); // 동작에 결과를 대입한다
        System.out.println("result1: " + result1);
    }
}
