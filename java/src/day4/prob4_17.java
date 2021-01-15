package day4;

public class prob4_17 {

	public static void main(String[] args) {
		for(int i = 0; i < 10;i++) {
			for(int j = 0;j < 10;j++) {
				if(i >= j) {
					System.out.print("■");
				}else {
					System.out.print("□");
				}
			}
			System.out.println();
		}
	}

}
