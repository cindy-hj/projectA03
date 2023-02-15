package projectA03;

public class projectA0320 {

	public static void main(String[] args) {
		int[] grade = new int[] {85, 65, 90}; // 1. 국어, 2. 영어, 3. 수학
		int sum = 0;
		int sums = 0;
		// 합을 구하고 평균을 구하시오
		for(int i = 0; i<grade.length; i++) {
			sum = sum + grade[i];
		}
		System.out.println("for 합은: "+sum);
		System.out.println("for 평균은: "+(double)sum/grade.length);
	
		for(int data:grade) { // for-each
			sums = sums + data;
		}

		System.out.println("for each 합은: "+sums);
		System.out.println("for each 평균은: "+(double)sums/grade.length);
	}
}
