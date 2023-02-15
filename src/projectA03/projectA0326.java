package projectA03;

public class projectA0326 {

	public static void main(String[] args) {
		// 9에서 9999까지 저장하는 배열을 만드시오
		// 총 합을 구하시오
		// 2, 4, 8의 배수를 각각 출력하시오
		// 2, 4, 8의 배수를 배열에 저장, 배열의 size는 10000개
		int count = 0; // 갯수를 저장
		int [] intArray, intArray2, intArray4, intArray8;
		int sum = 0; // 배열의 합
		
		for(int i=9; i<10000; i++) {
			count++;
		}
		
		intArray = new int[count];
		for(int i=0, j=9; i<count; i++, j++) {
			intArray[i] = j;
		}
		
		for(int data:intArray) {
			sum += data;
		}
		System.out.println("배열의 합: "+sum);
		
		intArray2 = new int[10000];
		System.out.println("2의 배수");
		int i = 0;
		for(int data:intArray) {
			if(data%2 == 0) {
				System.out.print(data+" ");
				intArray2[i]=data;
			}
			i++;
		}
		System.out.println();
		
		intArray4 = new int[10000];
		System.out.println("4의 배수");
		i = 0;
		for(int data:intArray) {
			if(data%4 == 0) {
				System.out.print(data+" ");
				intArray4[i]=data;
			}
			i++;
		}
		System.out.println();
		
		intArray8 = new int[10000];
		System.out.println("8의 배수");
		i = 0;
		for(int data:intArray) {
			if(data%8 == 0) {
				System.out.print(data+" ");
				intArray8[i]=data;
			}
			i++;
		}
		System.out.println();
		
	}

}
