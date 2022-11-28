package j09_접근지정자.test;

public class Access3 {

    private String address;

    private void printAddress() {
        String address = null;
        System.out.println("address: " + this.address);


    } // 자기클래스 안에 있으면 접근가능
}
