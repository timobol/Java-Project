package day3;

public class prob3_18 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 46) - 10;
		System.out.println("摂氏" + num + "度");

		if(num >= 30) {
			System.out.println("真夏日です。");
		}else if(num >= 25 && num < 30) {
			System.out.println("夏日です。");
		}else if(num < 0) {
			System.out.println("真冬日です。");
		}
	}

}
