package day6;

public class Sample601 {

	public static void main(String[] args) {
		SampleClass01 s = new SampleClass01(); //インスタンスの作成
		s.n = 100;                             //フィールドnに値を代入
		s.s = "Hello";                         //フィールドsに値を代入
		int ans = s.add(1,2);                  //メソッドadd()を呼び出し
		String str = s.add("World");           //メソッドadd()を呼び出し
		System.out.println(ans);               //呼び出しの結果を表示
		System.out.println(str);               //呼び出しの結果を表示
		s.showNum();                           //メソッドshowNum()を呼び出し
	}

}
