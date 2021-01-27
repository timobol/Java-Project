package exday3;

public class Crow2 extends Bird {
	//コンストラクタ（引数なし）
	public Crow2() {
		//親クラスのコンストラクタ
		super("カラス");
	}
	//カラスが鳴く
	public void sing() {
		System.out.println("カーカー");
	}
}
