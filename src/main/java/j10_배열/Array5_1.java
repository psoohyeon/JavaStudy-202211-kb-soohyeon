package j10_배열;

public class Array5_1 {

    public  static int getMinNumber(int num1, int num2){
        return  num1 < num2 ? num1 : num2;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 8, 12, 16, 17};
        int[] num2 = new int[]{2, 7, 11, 15, 18};
        int[] num3 = new int[]{3, 6, 10, 14, 19};
        int[] num4 = new int[]{4, 5, 9, 13, 20};

        int[] resultArray = new int[5];
          /*
            배열들 중 동일 인덱스에 위치한 값들 중 최소값들만 뽑앙서 새로운 배열을 만든다.

           */
        for (int i =0; i<num1.length; i++){
            resultArray[i] = getMinNumber(getMinNumber(num1[i], num2[i]), getMinNumber(num3[i], num4[i]));
            System.out.println(resultArray[i]);
        }
    }

}