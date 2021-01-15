package day3;

public class prob3_14 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 10) + 1;
		int b = (int)(Math.random() * 10) + 1;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		if(a > b) {
			System.out.println("aのほうが大きいです");
		}else if(a < b) {
			System.out.println("bのほうが大きいです");
		}else {
			System.out.println("等しいです");
		}

	}

}
