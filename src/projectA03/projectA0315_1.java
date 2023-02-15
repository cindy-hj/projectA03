package projectA03;

import java.util.Arrays;

public class projectA0315_1 {

	public static void main(String[] args) {
		int[] intArray = new int[100];
		
		for(int i=0, j=1; i<intArray.length; i++,j++) {
			intArray[i] = j;
		}
		System.out.println(Arrays.toString(intArray)); // Arrays는 util에 있는 기능
		int sum = 0;
		for(int i=0; i<100; i++) {
			sum = sum + intArray[i];
		}
		System.out.println(sum);
	}

}
