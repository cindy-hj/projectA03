package projectA03;

import java.util.Scanner;

public class projectA0317 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5]; // 배열 생성
		
		int max = 0; // 현재 가장 큰수
		System.out.println("양수 5개를 입력하세요.");
		for(int i = 0; i < 5; i++) { // 5번을 입력 받기 위해서 for 5번 loop
			intArray[i] = scanner.nextInt(); // 정수를 입력 받아 배열에 저장
			if(intArray[i] > max) {
				max = intArray[i];
			}
		}
		System.out.println("가장 큰 수는 "+max+"입니다.");
		scanner.close();
	}

}
