package day7;

class Hoge{
	//フィールドn
	int n = 1;
	//メソッド
	void foo() {
		System.out.println("n=" + this.n);
	}
}

public class Supplement01 {

	public static void main(String[] args) {
		Hoge h1 = new Hoge();
		Hoge h2 = h1;
		//h1のnに3を代入
		h1.n = 3;
		//nの値を表示
		h2.foo();
		Hoge h = null;  //hにnullを代入
/*
		h.n = 1;
		h.foo();
*/
	}

}
