package j14_스태틱;

/*
    공유영역

 */
import lombok.*;

@Data

public class Product {
    private static int autoIncrement = 20220000;

    private int serialNumber;
    private String name;

    public Product(String name) {
        this.serialNumber = ++autoIncrement;
        this.name = name;
    }

    public static void print() {
        System.out.println(autoIncrement);
//        System.out.println(serialNumber);
//        Product product = new Product("모니터");
        Product product = new Product("아이폰");
    }

    public int add(int a, int b) {
        return a + b;
    }
}


