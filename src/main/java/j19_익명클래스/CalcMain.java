package j19_익명클래스; //이름이 없는 클래스

public class CalcMain {

	public static void main(String[] args) {

		Calculator c1 = (x, y) -> x + y;
		/*
		 * 정의밖에 없음. 이미 자료형이 설정되어있기때문에 자료형, 중괄호 return,을 적을 필요 없음
		 */

//		
//		@Override
//		public int calc ( int a, int b) {
//			return a + b;
//		} // 클래스 정의와 생성
//		
//		Calculator c1 = (int x, int y) -> {
//			return x + y;
//		}; 

//		Calculator c1 = new Calculator() { // c1 값은 주소값, 생성된 힙메모리의 주소여야함
//			
//			@Override	// 임시로 오버라이드, 일회용 메서드
//			public int calc (int a, int b) { 
//				System.out.println("덧셈");
//				return a + b; 
//			}
//		};
//		

		CalculatorSub cs = (x) -> x * x;
		System.out.println(cs.calc(10));
		System.out.println(cs.a());

		int r1 = c1.calc(10, 20);
		System.out.println(r1);

		Calculator c2 = new Addition();

		int r2 = c2.calc(20, 30);
		System.err.println(r2);

	}
}
