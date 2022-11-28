package j12_추상.인터페이스;

public interface Calculator { // 기본이 추상 메소드다

//    private  String name; // 일반 변수는 사용 할 수 없다
//    public String name; //   사용 할 수 없다
 /*
     1. 모든 메소드는 기본적으로 추상 메소드이다.
     2. 변수는 선언할 수 없다.
     3. 상수는 선언할 수 있다. (기본적으로 모든 변수선언은 상수로 선언됨)
     4. 일반 메소드를 선언하고 싶으면 abstract 대신에 default 키워드를 사용한다.

  */
    public int ERROR_CODE = -9999999;

    public  int  calc(int[] values); // 추상메소드를 담기위함

    public default  void setErrorCode() {
//        ERROR_CODE = 10;  <- 상수 사용 못함
    }
}
