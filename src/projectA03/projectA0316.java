package projectA03;

import java.util.Arrays;

public class projectA0316 {

	public static void main(String[] args) {
		int [] intArray = new int[200];
		
		for(int i=0, j=1; i<intArray.length; i++, j++) {
			intArray[i] = j;
		}
		System.out.println(Arrays.toString(intArray));
		
		int sum = 0;
		for(int i=0; i<intArray.length; i++) {
			sum = sum + i;
		}
		System.out.println("0부터 200까지의 합은 :"+sum);
	}

}
