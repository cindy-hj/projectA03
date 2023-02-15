package projectA03;

public class projectA0310 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		for (i=0; i<=100; i++) {
			// continue
			if(i%2 != 0) {
				continue;
			}
			sum = sum + i;
		}
		System.out.println("짝수의 합: "+sum);

	}

}
