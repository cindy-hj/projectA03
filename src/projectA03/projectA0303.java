package projectA03;

public class projectA0303 {

	public static void main(String[] args) {
		// 1에서부터 20까지의 정수 중에 2 또는 3의 배수가 아닌 수의 총합을 구하시오
		int sum = 0;
		for(int i = 1; i <= 20; i++) {
			if(i%2 != 0 && i%3 != 0) {
				sum = sum + i;
			}
		}
		System.out.print(sum);
		System.out.println();
		
		int i = 1;
		sum = 0;
		while(i<=20) {
			if(i%2 != 0 && i%3 != 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.print(sum);
		System.out.println();
		
		i = 1;
		sum = 0;
		do {
			if(i%2 != 0 && i%3 != 0) {
				sum = sum + i;
			}
			i++;
		} while(i<=20);
		System.out.print(sum);
		System.out.println();
	}

}
