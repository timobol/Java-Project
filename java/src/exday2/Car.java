package exday2;

public class Car {
	private int fuel = 0; //燃料
	private int migration = 0; //移動距離
	//コンストラクタ
	public Car() {
		System.out.println("Carオブジェクト作成");
	}
	//移動メソッド
	public void move() {
		//燃料があるなら移動
		if(fuel >= 0) {
			migration++; //移動距離
			fuel--;  //燃料
		}
		System.out.println("移動距離：" + migration);
		System.out.println("燃料：" + fuel);
	}
	//燃料補給メソッド
	public void supply(int fuel) {
		if(fuel > 0) {
			this.fuel = fuel;  //燃料補給
		}
		System.out.println("燃料：" + fuel);
	}

}
