package projectA03;
/**********************************
 * 
 * @author shj
 * 설명 : 배열이 1에서 부터 100까지 짝수를 저장하시오
		 이 배열의 합은 얼마입니까
		 8의 배수를 화면에 출력 하시오
 * 작성일 : 2023.02.15 
 * 수정일 : 2023.02.15
 *
 ***********************************/

public class projectA0325 {

	public static void main(String[] args) {
		// 배열이 1에서 부터 100까지 짝수를 저장하시오
		// 이 배열의 합은 얼마입니까
		// 8의 배수를 화면에 출력 하시오
		int count = 0;
		int [] intArray; // 사용할 배열, 짝수를 저장함
		int sum; // 짝수의 합 저장함
		
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				count = count + 1;
			}
		}
		System.out.println(count);
		
		intArray = new int[count];
		
		for(int i=0, j=0; i<count; i++, j=j+2) {
			intArray[i] = j;
		}
		
		sum = 0;
		for(int data:intArray) {
			sum += data;
		}
		System.out.println("배열의 합은: "+sum);
		
		for(int data:intArray) {
			if(data%8 == 0) {
				System.out.print(data+" ");
			}
		}

	}

}
