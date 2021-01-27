package exday3;

public class SampleEx302 {

	public static void main(String[] args) {
		Crow2 c = new Crow2();
		Sparrow2 s = new Sparrow2();
		//カラスが鳴く
		System.out.print(c.getName() + " : ");
		c.sing();
		//雀が鳴く
		System.out.print(s.getName() + " : ");
		s.sing();

		//抽象クラスはインスタンスを作成できない。
//		Bird b = new Bird("とり");
	}

}
