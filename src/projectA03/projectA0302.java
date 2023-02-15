package projectA03;

public class projectA0302 {

	public static void main(String[] args) {
		// 1. for, while, do-while
		// 0~100까지 5의 배수의 합을 구하시오
		int sum = 0;
		for(int i = 0; i<=100; i++) {
			if(i%5 == 0) {
				sum = sum + i;
			}
		}
		System.out.print(sum);
		System.out.println();
		
		int i = 0;
		sum = 0;
		while(i<=100) {
			if(i%5 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.print(sum);
		System.out.println();

		i = 0;
		sum = 0;
		do {
			if(i%5 == 0) {
				sum = sum + i;
			}
			i++;
		} while(i<=100);
		System.out.print(sum);
		System.out.println();
		
		// 2. 100~200까지 8의 배수의 합을 구하시오
		sum = 0;
		for(i = 100; i<=200; i++) {
			if(i%8 == 0) {
				sum = sum + i;
			}
		}
		System.out.print(sum);
		System.out.println();
		
		i = 100;
		sum = 0;
		while(i<=200) {
			if(i%8 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.print(sum);
		System.out.println();

		i = 100;
		sum = 0;
		do {
			if(i%8 == 0) {
				sum = sum + i;
			}
			i++;
		} while(i<=200);
		System.out.print(sum);
		System.out.println();
		
	}

}
