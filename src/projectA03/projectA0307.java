package projectA03;

import java.util.Scanner;

public class projectA0307 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("시작 자료를 입력하세요: ");
		String sDataStart = in.nextLine();
		System.out.println("종료 자료를 입력하세요: ");
		String sDataEnd = in.nextLine();

		int iDataStart = Integer.parseInt(sDataStart);
		int iDataEnd = Integer.parseInt(sDataEnd);
		
		// iDataStart에서 부터 iDataEnd까지의 값중에 7의 배수의 합은?
		
		int sum = 0;
		for(int i = iDataStart; i <= iDataEnd; i++) {
			if(i%7 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("for문의 합: "+sum);
		System.out.println();
		
		sum = 0;
		int i = iDataStart;
		while(i <= iDataEnd) {
			if(i%7 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("while문의 합: "+sum);
		System.out.println();
		
		sum = 0;
		i = iDataStart;
		do {
			if(i%7 == 0) {
				sum = sum + i;
			}
			i++;
		} while(i <= iDataEnd);
		System.out.println("do-while문의 합: "+sum);
		System.out.println();
	}

}
