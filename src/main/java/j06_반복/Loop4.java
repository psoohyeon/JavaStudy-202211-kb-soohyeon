package j06_반복;

public class Loop4 {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i +1; j++){
                System.out.print("*");
            }
            System.out.println();
            }
        System.out.println("--------------");

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 5 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------");

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 5 - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------");

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 1 + i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 5 - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        }
    }

