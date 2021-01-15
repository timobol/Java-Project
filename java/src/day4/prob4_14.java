package day4;

public class prob4_14 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) + 1;

		if(num % 2 == 0) {
			for(int i = 0;i < num;i++) {
				System.out.print("★");
			}
		}else {
			for(int i = 0;i < num; i++) {
				System.out.print("☆");
			}
		}
		System.out.println();
	}

}
