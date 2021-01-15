package day3;

public class prob3_13 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 3) + 1;
		System.out.println(num);

		switch(num) {
			case 1:
				System.out.println("グー");
				break;
			case 2:
				System.out.println("パー");
				break;
			case 3:
				System.out.println("チョキ");
				break;
			default:
				break;
		}

	}

}
