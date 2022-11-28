package BackjJoon;

import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();

        if(A > 89 && A < 101){
            System.out.println("A");
        } else if (A > 79) {
            System.out.println("B");
        } else if (A > 69) {
            System.out.println("C");
        } else if (A > 59) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
