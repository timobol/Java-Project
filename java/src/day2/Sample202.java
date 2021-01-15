package day2;

public class Sample202 {

	public static void main(String[] args) {
		int a;      //変数の宣言
		int b = 5;  //初期化と代入を行う
		int add,sub;  //複数の変数を同時に宣言
		double avg;   //int以外の変数を宣言
		a = 8;  //代入（最初に値を入れるので、”初期化”という）
		add = a + b;  //a,bの和を求める
		sub = a - b;  //a,bの差を求める
		avg = (a + b) / 2.0;  //a,bの平均値を求める
		System.out.println(a + " + " + b + " = " + add);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + "と" + b + "の平均値：" + avg);
	}

}
