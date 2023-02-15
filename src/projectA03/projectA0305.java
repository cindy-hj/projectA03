package projectA03;

public class projectA0305 {

	public static void main(String[] args) {
		// 1+5 = 6
		// 2+4 = 6
		// 3+3 = 6
		// 4+2 = 6
		// 5+1 = 6
		// for
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=5; j++) {
				if((i+j) == 6) {
					System.out.println(i+"+"+j+"="+(i+j));
				}
			}
		}
	}

}
