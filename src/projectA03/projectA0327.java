package projectA03;

import java.util.Arrays;

public class projectA0327 {

	public static void main(String[] args) {
		// 7에서 777까지 저장하는 배열을 만드시오
		// 총 합을 구하시오
		// 2, 4, 8의 배수를 각각 출력하시오
		// 2, 4, 8의 크기에 맞추어 배열을 만들고 값을 저장하시오

		int [] intArray, intArray2, intArray4, intArray8; // 배열
		int count = 0; // 갯수
		int sum = 0; // 합
		
		for(int i=7; i<=777; i++) {
			count++;
		}
		
		intArray = new int[count];
		for(int i=0, j=7; i<count; i++, j++) {
			intArray[i] = j;
		}
		
		for(int data:intArray) {
			sum += data;
		}
		System.out.println("배열의 합: "+sum);
		
		count = 0;
		System.out.println("2의 배수");
		for(int data:intArray) {
			if(data%2 ==0) {
				System.out.print(data+" ");
				count++;
			}
		}
		int i = 0;
		intArray2 = new int[count];
		for(int data:intArray) {
			if(data%2 ==0) {
				intArray2[i] = data;
				i++;
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(intArray2));
		
		count = 0;
		System.out.println("4의 배수");
		for(int data:intArray) {
			if(data%4 ==0) {
				System.out.print(data+" ");
				count++;
			}
		}
		i = 0;
		intArray4 = new int[count];
		for(int data:intArray) {
			if(data%4 ==0) {
				intArray4[i] = data;
				i++;
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(intArray4));
		
		count = 0;
		System.out.println("8의 배수");
		for(int data:intArray) {
			if(data%8 ==0) {
				System.out.print(data+" ");
				count++;
			}
		}
		i = 0;
		intArray8 = new int[count];
		for(int data:intArray) {
			if(data%8 ==0) {
				intArray8[i] = data;
				i++;
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(intArray8));
		
	}

}
