package projectA03;

public class projectA0308 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		for(i = 0; i<=100; i++) {
			sum = sum + i;
			if(i == 10) {
				break;
			}
		}
		
		int suma = 0;
		for(i = 0; i<=100; i++) {
			sum = sum + i;
			if(i >= 10) {
				suma = suma + i;
				continue; // continue를 만나면 다음 라인을 실행하지 않고 이전 라인이 반복됨
//				System.out.print(suma); unreachable code 오류 발생
			}
//			System.out.print(suma); 0000000000 출력
			// continue 만난 후 코드가 실행되지 않았기 때문
		} 
//		System.out.print(suma); 5005 출력
		// if문을 돌고 나온 suma값이 출력된것

		i = 0;
		sum = 0;
		for(i=0; i<=100; i++) {
			if(i%2==0) {
				continue; // 짝수면 아무것도 실행하지 않음
			}
			sum = sum + i;
			System.out.println(i); // 홀수만 출력됨
		}
		System.out.println("홀수의 합: "+sum);
		
	}

}
