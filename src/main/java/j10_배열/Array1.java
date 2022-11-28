package j10_배열;

public class Array1 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        // int[] 배열 자료형 변수가 numbers = new(동적 메모리 할당) int[10] (인덱스 , int형의 인스턴스 n개)

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        for(int i = 0; i< 5; i++) {
            System.out.println(numbers[i]);
        } // 반복문

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);


    }
}
