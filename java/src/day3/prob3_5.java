package day3;

public class prob3_5 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 100) + 1;

		System.out.println(num);
		if(num >= 20 && num < 80) {
			System.out.println("20位上80未満です");
		}

	}

}
