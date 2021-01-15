package exday2;

class Parent2{
	//メソッド
	void method() {
		System.out.println("parent");
	}
}

//サブクラス
class Child2 extends Parent2{
	//メソッド（オーバーライドされたもの）
	@Override
	void method() {
		System.out.println("child");
	}
	//本来はオーバーライドされていないのにオーバーライドしたもの（エラーになる）

	//アノテーション
/*
	@Override
 	void method2(){
 		System.out.println("method2");
*/
}

public class Supplement02 {

	public static void main(String[] args) {
		Parent2 p = new Parent2();
		//スーパークラスのメソッド実行
		p.method();
		Child2 c = new Child2();
		//オーバーライドされたメソッドの実行
		c.method();

	}

}
