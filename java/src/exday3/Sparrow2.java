package exday3;

public class Sparrow2 extends Bird {
	//コンストラクタ（引数なし）
	public Sparrow2() {
		//親クラスのコンストラクタ
		super("すずめ");
	}
	//雀が鳴く
	public void sing() {
		System.out.println("チュンチュン");
	}

}
