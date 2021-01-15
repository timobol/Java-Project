package day4;

public class prob4_2 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 7) + 1;
		System.out.println("数：" + num);

		int i = 0;
		while(i < num) {
			System.out.print("■");
			i++;
		}
		System.out.println();
	}

}
