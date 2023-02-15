package projectA03;

public class projectA0322 {

	public static void main(String[] args) {
		float[] grade = new float[] {80.10f, 90.11f, 99.12f}; // double값이라 형을 강제로 변형시켜야함
		// 합과 평균을 구하시오
		float sum = 0;
		for(float data:grade) {
			sum = sum + data;
		}
		System.out.println("합은: "+sum);
		System.out.println("평균은: "+sum/grade.length);
	}

}
