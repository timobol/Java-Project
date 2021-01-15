package exday2;

//スーパークラス
class Parent1{
	//メソッド
	void method() {
		System.out.println("parent");
	}
	//メソッド（オーバーロードされたもの）
	void method(String s) {
		System.out.println("method:" + s);
	}
}

//サブクラス
class Child1 extends Parent1{
	//メソッド（オーバーライドされたもの）
	void method() {
		System.out.println("child");
	}
	//本来はオーバーライドされていないのにオーバーライドしたもの（エラーになる）
}

public class Supplement01 {

	public static void main(String[] args) {
		Parent1 p = new Parent1();
		p.method();
		p.method("parent");
		Child1 c = new Child1();
		c.method();
		c.method("child");
		//Childのインスタンスが生成される
		Parent1 cp = new Child1();
		cp.method();
		cp.method("parent and child");
	}

}
