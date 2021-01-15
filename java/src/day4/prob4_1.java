package day4;

public class prob4_1 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 7) + 1;
		System.out.println("数：" + num);

		for(int i = 0; i < num; i++) {
			System.out.print("■");
		}
	}

}
