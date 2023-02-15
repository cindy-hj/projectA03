package projectA03;

public class projectA0311 {

	public static void main(String[] args) {
		// 0에서 부터 100까지의 수 중에 7의 배수, 8의 배수, 9의 배수를 제외한 수의 합은?
		// continue
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i%7 == 0 || i%8 == 0 || i%9 ==0) {
				continue;
			}
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
