package projectA03;

import java.util.Scanner;

public class projectA0306 {

	public static void main(String[] args) {
		// 1에서 부터 입력 받은 수까지 합을 계산하시오
		// Scanner를 사용하여 정수를 입력 받는다
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		String sData = scanner.nextLine(); // string으로 입력받아서
		int iData = Integer.parseInt(sData); // int로 변환시킴
		
		int sum = 0;
		for(int i = 1; i<=iData; i++) {
			sum = sum + i;
		}
		System.out.println("for문의 합: "+sum);
		
		sum = 0;
		int i = 1;
		while(i<=iData) {
			sum = sum + i;
			i++;
		}
		System.out.println("while문의 합: "+sum);
		
		sum = 0;
		i = 1;
		do {
			sum = sum + i;
			i++;
		} while(i<=iData);
		System.out.println("do-while문의 합: "+sum);
				
		scanner.close();
	}

}
