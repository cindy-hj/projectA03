package projectA03;

import java.util.Scanner;

public class projectA0315 {

	public static void main(String[] args) {
		// 9개의 점수를 입력받아서 합과 평균 구하기
		int intArray[] = new int[9];
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(intArray.length+"과목의 점수를 입력하세요.");
		
		for(int i = 0; i<intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}
		
		for(int i=0; i<intArray.length; i++) {
			sum = sum + intArray[i];
		}
		System.out.println("합은"+sum);
		System.out.println("평균은 "+(double)sum/intArray.length);
		scanner.close();
	}

}
