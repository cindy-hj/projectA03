package projectA03;

public class projectA0324 {

	public static void main(String[] args) {
		// 배열에 1에서부터 100까지 홀수를 저장하시오
		// 이 배열의 합은 얼마입니까
		// 7의 배수를 화면에 출력하시오
		int [] intArray = new int[50];
		for(int i = 0, j = 1; i<intArray.length; i++, j+=2) {
			intArray[i] = j;
		}
		
		int sum = 0;
		int sev = 0;
		for(int data:intArray) {
			sum += data;
			if(data%7 ==0) {
				sev = data;
				System.out.println(sev);
			}
		}
		System.out.println("배열의 합: "+sum);
		
	}

}
