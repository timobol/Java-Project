package day4;

public class prob4_13 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) + 1;
		if(num >= 5) {
			System.out.println("発生した数値；" + num);
			for(int i = 0;i < num; i++) {
				System.out.print("★");
			}
		}else {
			System.out.println("発生した数値；" + num);
		}

	}

}
