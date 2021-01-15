package day4;

public class Supplement01 {

	public static void main(String[] args) {
		//初期値設定
		int c1 = 1, c2 = 1, c3 = 1, c4 = 1;
		int n1 = c1++;
		int n2 = ++c2;
		int n3 = c3--;
		int n4 = --c4;
		System.out.println("n1=" + n1 + " c1=" + c1);
		System.out.println("n2=" + n2 + " c2=" + c2);
		System.out.println("n3=" + n3 + " c3=" + c3);
		System.out.println("n4=" + n4 + " c4=" + c4);
	}

}
