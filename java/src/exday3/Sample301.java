package exday3;

public class Sample301 {

	public static void main(String[] args) {
		Crow1 c = new Crow1();  //カラスクラス
		Sparrow1 s = new Sparrow1();  //すずめクラス
		//カラスが鳴く
		System.out.print(c.getName() + ":");
		c.sing();
		//雀が鳴く
		//s.setName("舌切り雀");
		System.out.print(s.getName() + ":");
		s.sing();
	}

}
