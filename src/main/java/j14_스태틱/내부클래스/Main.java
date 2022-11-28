package j14_스태틱.내부클래스;

public class Main {

    public static void main(String[] args) {
        A.B b = new A().new B("박땡땡");
        // a클래스 안에 b클래스로 가라
        System.out.println(b.getName());
    }
}
