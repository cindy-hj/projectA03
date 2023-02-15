package projectA03;

public class projectA0323 {

	public static void main(String[] args) {
		// 배열 크기가 100인 배열을 만든다
		// 배열의 값은 1에서 부터 100까지 할당한다
		// for each문을 사용하여 합을 계산한다
		// 짝수와 홀수의 합도 계산한다
		int [] intArray = new int[100];
		for(int i = 0, j = 1; i<intArray.length; i++, j++) {
			intArray[i] = j;
		}
		
		int sum = 0, sumOdd = 0, sumEven = 0;
		
		for(int data:intArray) {
			sum += data;
			if(data%2 != 0) {
				sumOdd += data; 
			} else {
				sumEven += data;
			}
		}
		System.out.println("합은: "+sum);
		System.out.println("홀수의 합은: "+sumOdd);
		System.out.println("짝수의 합은: "+sumEven);
	}

}
