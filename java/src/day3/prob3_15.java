package day3;

public class prob3_15 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 100) + 1;

		System.out.println("点数：" + num);

		if(num >= 80) {
			System.out.println("優");
		}else if(num < 80 && num >= 70) {
			System.out.println("良");
		}else if(num < 70 && num >= 60) {
			System.out.println("可");
		}else {
			System.out.println("不可");
		}

	}

}
