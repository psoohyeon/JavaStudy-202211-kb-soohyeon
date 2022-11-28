package j14_스태틱.싱글톤;

public class ScannerMain {

    public static void main(String[] args) {
        Scanner1 s1 = new Scanner1();
        Scanner2 s2 = new Scanner2();

//      ScannerSingleton scannerSingleton = new ScannerSingleton();

        s1.inputName();
        s2.inputAge();
    }
}
