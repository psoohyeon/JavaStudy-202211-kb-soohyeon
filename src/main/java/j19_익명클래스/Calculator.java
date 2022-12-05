package j19_익명클래스;

import lombok.Builder.Default;

@FunctionalInterface
public interface Calculator {

	public int calc(int a, int b); // 추상메소드는 딱 하나만 있어야 한다.

	public default int a() {
		return 10;
	}
}
