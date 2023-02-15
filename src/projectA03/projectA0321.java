package projectA03;

public class projectA0321 {

	public static void main(String[] args) {
		double[] grade = {85.12, 65.23, 90.23};
		// 합과 평균을 구하시오
		double sum = 0;
		for(double data:grade) {
			sum = sum + data;
		}
		System.out.println("합은: "+sum);
		System.out.println("평균은: "+sum/grade.length);

	}

}
