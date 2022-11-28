package j14_스태틱.빌더;

import javax.swing.*;

public class ProductMain {

    public static void main(String[] args) {
        Product product = Product.builder()
                .productCode(1)
                .productName("2")
                .price(3)
                .stock(4)
                .build();

    }

}
