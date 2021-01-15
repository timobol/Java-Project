package day7;

public class Sample701 {

	public static void main(String[] args) {
		SampleClass02 s = new SampleClass02();
		//method1()はpravateなので、外部からアクセスできない
		//s.method1();
		//method2呼び出し
		s.method2();
		//method3呼び出し
		s.method3();
		//numは、privateフィールドなので、外部からはアクセスできない。
		//s.num = 1;

	}

}
