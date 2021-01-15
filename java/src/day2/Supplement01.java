package day2;

public class Supplement01 {

	public static void main(String[] args) {
		// 整数リテラル
		int n1 = 2;		//	通常の変数
		int n2 = 02; 	//	8進数
		int n3 = 0x2;	//	16進数
		int n4 = 0b10;	//	2進数
		int n = 123_456;	//	間に_の入った整数
		long l = 2l;
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
		System.out.println("n3="+n3);
		System.out.println("n4="+n4);
		System.out.println("n="+n);
		System.out.println("l="+l);
		//	浮動小数点リテラル
		double d1 = 1.23;		//	普通の実数（double)
		float d2 = 1.23F;		//	float
		double d3 = 1.23D;		//	double
		double d4 = 1.23e4;	//	4乗
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);
		System.out.println("d4="+d4);
		//	文字リテラル
		char c1='a';	//	半角文字一文字
		char c2='あ';	//	全角文字一文字
		char c3='\\';	//	エスケープシーケンス（\マーク)
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		//	文字列リテラル
		System.out.println("abc");			//	半角文字の文字列
		System.out.println("あいうえお");	//	全角文字の文字列
		System.out.println("A");			//	一文字でも文字列
		//	論理値リテラル
		System.out.println(10 > 3);		//	正しい命題　…　true
		System.out.println(1 < -5);		//	間違った命題　…　false

	}

}
