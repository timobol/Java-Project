package day5;

public class Sample502 {

	public static void main(String[] args) {
		int n[] = {6, 5, 4, 3, 2, 1};
		String s[] = {"ABC", "DEF", "GHI", "JKL"};
		int i;
		//整数値配列変数nのd成分表示
		for(i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
	    //文字型配列変数nの成分表示
		for(i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
	}

}
