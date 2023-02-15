package projectA03;

public class projectA0301 {

	public static void main(String[] args) {
		// 1. 1에서부터 9까지 출력하는 프로그램을 for, while, do-while
		for(int i = 1; i < 10; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		int i = 1;
		while(i<10) {
			System.out.print(i);
			i++;
		}
		System.out.println();
		
		i = 1;
		do {
			System.out.print(i);
			i++;
		} while(i<10);

	}

}
